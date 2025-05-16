package com.inessa.fractions;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;


// Контроллер для окна
public class FracController {

    @FXML
    public TextField Num1; // поле для ввода числителя первой дроби

    @FXML
    public TextField Num2; // поле для ввода числителя второй дроби

    @FXML
    public TextField Den1; // поле для ввода знаменателя первой дроби

    @FXML
    public TextField Den2; // поле для ввода знаменателя второй дроби

    @FXML
    public TextField Ans; // поле для вывода ответа
    
    public Frac first = new Frac(); // создание первой дроби
    public Frac sec = new Frac(); // создание второй дроби

    // действия при нажатии на кнопку сумма
    public void onSumbClick()
    {
        try {
            first.setNum(Integer.parseInt(Num1.getText()));
            first.setDen(Integer.parseInt(Den1.getText()));
            sec.setNum(Integer.parseInt(Num2.getText()));
            sec.setDen(Integer.parseInt(Den2.getText()));
            Frac rez = Frac.summ(first, sec); // вызов метода сложения двух дробей
            Ans.setText(rez.toString()); // вывод ответа
        }
        catch (NumberFormatException ex)
        {

        }
    }

    // действие при нажатии на кнопку разность
    public void onMindClick()
    {
        try {
            first.setNum(Integer.parseInt(Num1.getText()));
            first.setDen(Integer.parseInt(Den1.getText()));
            sec.setNum(Integer.parseInt(Num2.getText()));
            sec.setDen(Integer.parseInt(Den2.getText()));
            Frac rez = Frac.minus(first, sec); // вызов метода разности двух дробей
            Ans.setText(rez.toString()); // вывод ответа
        }
        catch (NumberFormatException ex)
        {

        }
    }

    // действие при нажатии на кнопку умножение
    public void onCompdClick()
    {
        try {
            first.setNum(Integer.parseInt(Num1.getText()));
            first.setDen(Integer.parseInt(Den1.getText()));
            sec.setNum(Integer.parseInt(Num2.getText()));
            sec.setDen(Integer.parseInt(Den2.getText()));
            Frac rez = Frac.comp(first, sec); // вызов метода перемножения двух дробей
            Ans.setText(rez.toString()); // вывод ответа
        }
        catch (NumberFormatException ex)
        {

        }
    }

    // действие при нажатии на кнопку деление
    public void onDivisdClick()
    {
        try {
            first.setNum(Integer.parseInt(Num1.getText()));
            first.setDen(Integer.parseInt(Den1.getText()));
            sec.setNum(Integer.parseInt(Num2.getText()));
            sec.setDen(Integer.parseInt(Den2.getText()));
            Frac rez = Frac.divis(first, sec); // вызов метода деления двух дробей
            Ans.setText(rez.toString()); // вывод ответа
        }
        catch (NumberFormatException ex)
        {

        }
    }

}