# Создание установочного файла для JavaFX приложения с использованием Inno Setup

---

## 1. Создание JAR-файла в IntelliJ IDEA

### 1.1. Настройка проекта
Создайте новый главный класс Launcher
   ```java
   package com.inessa.fractions;
   import javafx.application.Application;
   /**
    * Новый главный класс
   */
   public class Launcher {
      public static void main(String[] args)
      {
          Application.launch(FracApp.class, args);
      }
   }
```
### 1.2. Создание Artifact
Перейдите в File -> Project Structure -> Artifacts.

Нажмите + -> JAR -> From modules with dependencies.

Выберите главный класс.

Включите опцию Include dependencies (если используются внешние библиотеки).

### 1.3. Сборка JAR-файла
Выберите Build -> Build Artifacts.

Нажмите Build для вашего артефакта.

Готовый JAR будет в папке out/artifacts/<Имя_проекта>_jar.
## 2 Создание установщика в Inno Setup
### 2.1. Установка Inno Setup
Скачайте Inno Setup с официального сайта.

Установите программу, следуя инструкциям мастера.

### 2.2. Создание скрипта установщика
Запустите Inno Setup и выберите Create a new script file using the Script Wizard.

Настройте все необходимые поля в Script Wizard и выберите в Application main executable file готовый JAR файл в папке out/artifacts/<Имя_проекта>_jar.

### 2.3 Компиляция установщика
Сохраните скрипт (.iss файл).

Нажмите Build -> Compile в Inno Setup Compiler для создания установщика.

Готовый .exe файл будет в папке Output.
