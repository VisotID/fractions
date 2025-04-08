package com.inessa.fractions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс для тестирования работы методов
 */
class FracTest {

    private Frac fract; // поле класса дробь

    /**
     *  @BeforeEach - показатель того, что данный метод будет выполняться перед каждым методом тестом автоматически
     */
    @BeforeEach
    void SetUp()
    {
        fract = new Frac(); // создание дроби класса Frac
    }

    /**
     * @Test - метод тест, для проверки конструктора по умолчанию
     * assertEquals - проверка равенства(expected - ожидаемое значение, наше значение)
     */
    @Test
    void TestConstr()
    {
        assertEquals(0, fract.getNum()); // проверка числителя, задаваемого по умолчанию
        assertEquals(1, fract.getDen()); // проверка знаменателя, задаваемого по умолчанию
    }

    /**
     * @Test - метод тест, для проверки конструктора с параметрами
     * assertEquals - проверка равенства(expected - ожидаемое значение, наше значение)
     */
    @Test
    void TestParConstr()
    {
        Frac TFrac = new Frac(2, 5); // создание дроби 2/5
        assertEquals(2, TFrac.getNum()); // проверка числителя
        assertEquals(5, TFrac.getDen()); // проверка знаменателя
    }

    /**
     * @Test - метод тест, для проверки инициализации числителя
     * assertEquals - проверка равенства(expected - ожидаемое значение, наше значение)
     */
    @Test
    void setNum() {
        fract.setNum(4); // меняем числитель на 4
        assertEquals(4, fract.getNum()); // проверка числителя
    }

    /**
     * @Test - метод тест, для проверки инициализации знаменателя
     * assertEquals - проверка равенства(expected - ожидаемое значение, наше значение)
     */
    @Test
    void setDen() {
        fract.setDen(5); // меняем знаменатель на 5
        assertEquals(5, fract.getDen()); // проверка знаменателя
    }

    /**
     * @Test - метод тест, для проверки метода просмотра значения числителя
     * assertEquals - проверка равенства(expected - ожидаемое значение, наше значение)
     */
    @Test
    void getNum() {
        assertEquals(0, fract.getNum()); // проверка числителя, задаваемого по умолчанию
        fract.setNum(5); // меняем числитель на 5
        assertEquals(5, fract.getNum()); // проверка числителя
    }

    /**
     * @Test - метод тест, для проверки метода просмотра значения знаменателя
     * assertEquals - проверка равенства(expected - ожидаемое значение, наше значение)
     */
    @Test
    void getDen() {
        assertEquals(1, fract.getDen()); // проверка знаменателя, задаваемого по умолчанию
        fract.setDen(6); // меняем знаменатель на 6
        assertEquals(6, fract.getDen()); // проверка знаменателя
    }

    /**
     * @Test - метод тест, для проверки метода перевода в строку
     * assertEquals - проверка равенства(expected - ожидаемое значение, наше значение)
     */
    @Test
    void testToString() {
        String s = "0/1"; // создание переменной типа строка
        assertEquals(s, fract.toString()); // проверка равенства строки
        fract.setNum(2); // меняем числитель на 2
        fract.setDen(5); // меняем знаменатель на 5
        String s2 = "2/5"; // создание переменной типа строка
        assertEquals(s2, fract.toString()); // проверка равенства строки
    }

    /**
     * @Test - метод тест, для проверки метода сложения двух дробей
     * assertEquals - проверка равенства(expected - ожидаемое значение, наше значение)
     */
    @Test
    void summ() {
        fract.setNum(1); // меняем числитель на 1
        fract.setDen(2); // меняем знаменатель на 2
        Frac Tfrac = new Frac(1, 2); // создание дроби 1/2
        Frac Sum = Frac.summ(fract, Tfrac); // создание дроби и вызов метода сложения двух дробей
        assertEquals(1.0, Sum.dec()); // проверка равенства
    }

    /**
     * @Test - метод тест, для проверки метода перемножения двух дробей
     * assertEquals - проверка равенства(expected - ожидаемое значение, наше значение)
     */
    @Test
    void comp() {
        fract.setNum(1); // меняем числитель на 1
        fract.setDen(2); // меняем знаменатель на 2
        Frac Tfrac = new Frac(1, 2); // создание дроби 1/2
        Frac Comp = Frac.comp(fract, Tfrac); // создание дроби и вызов метода перемножения двух дробей
        assertEquals(0.25, Comp.dec()); // проверка равенства
    }

    /**
     * @Test - метод тест, для проверки метода разности двух дробей
     * assertEquals - проверка равенства(expected - ожидаемое значение, наше значение)
     */
    @Test
    void minus() {
        fract.setNum(1); // меняем числитель на 1
        fract.setDen(2); // меняем знаменатель на 2
        Frac Tfrac = new Frac(1, 2); // создание дроби 1/2
        Frac Minus = Frac.minus(fract, Tfrac); // создание дроби и вызов метода разности двух дробей
        assertEquals(0.0, Minus.dec()); // проверка равенства
    }

    /**
     * @Test - метод тест, для проверки метода деления двух дробей
     * assertEquals - проверка равенства(expected - ожидаемое значение, наше значение)
     */
    @Test
    void divis() {
        fract.setNum(1); // меняем числитель на 1
        fract.setDen(2); // меняем знаменатель на 2
        Frac Tfrac = new Frac(1, 2); // создание дроби 1/2
        Frac Efrac = new Frac(0, 4);
        Frac Divis = Frac.divis(fract, Tfrac); // создание дроби и вызов метода деления двух дробей
        assertEquals(1.0, Divis.dec()); // проверка равенства
        assertThrows(RuntimeException.class, () -> Frac.divis(fract, Efrac)); // проверка на вывод ошибки в случае деления на 0
    }

    /**
     * @Test - метод тест, для проверки метода перевода в десятичную дробь
     * assertEquals - проверка равенства(expected - ожидаемое значение, наше значение)
     */
    @Test
    void dec() {
        assertEquals(0.0, fract.dec()); // проверка дроби, задаваемой по умолчанию
        fract.setNum(1); // меняем числитель на 1
        fract.setDen(2); // меняем знаменатель на 2
        assertEquals(0.5, fract.dec()); // проверка равенства
    }
}