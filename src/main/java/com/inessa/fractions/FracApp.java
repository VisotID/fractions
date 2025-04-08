package com.inessa.fractions;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FracApp extends Application {
    @Override // переопределение
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(FracApp.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 547, 490);
        stage.setTitle("Fraction"); // имя главного окна
        stage.setScene(scene);
        stage.show();
    }

    /**
     * точка входа
     * public - позволяет вызвать метод из-за пределов класса
     * static - позволяет вызвать метод без создания экземпляра класса
     * String[] args - позволяет вызвать программу с несколькими аргументами
     * launch() - метод для запуска приложения
     */
    public static void main(String[] args) { launch(); }
}