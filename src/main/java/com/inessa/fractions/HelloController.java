package com.inessa.fractions;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    public TextField Num1;

    @FXML
    public TextField Num2;

    @FXML
    public TextField Den1;

    @FXML
    public TextField Den2;

    @FXML
    public TextField Ans;

    public void onSumbClick()
    {
        try {
            Frac first = new Frac(Integer.parseInt(Num1.getText()), Integer.parseInt(Den1.getText()));
            Frac sec = new Frac(Integer.parseInt(Num2.getText()), Integer.parseInt(Den2.getText()));
            Frac rez = new Frac().summ(first, sec);
            Ans.setText(rez.toString());
        }
        catch (NumberFormatException ex)
        {

        }
    }

    public void onMindClick()
    {
        try {
        Frac first = new Frac(Integer.parseInt(Num1.getText()), Integer.parseInt(Den1.getText()));
        Frac sec = new Frac(Integer.parseInt(Num2.getText()), Integer.parseInt(Den2.getText()));
        Frac rez = new Frac().minus(first, sec);
        Ans.setText(rez.toString());
        }
        catch (NumberFormatException ex)
        {

        }
    }

    public void onCompdClick()
    {
        try {
        Frac first = new Frac(Integer.parseInt(Num1.getText()), Integer.parseInt(Den1.getText()));
        Frac sec = new Frac(Integer.parseInt(Num2.getText()), Integer.parseInt(Den2.getText()));
        Frac rez = new Frac().comp(first, sec);
        Ans.setText(rez.toString());
        }
        catch (NumberFormatException ex)
        {

        }
    }

    public void onDivisdClick()
    {
        try {
        Frac first = new Frac(Integer.parseInt(Num1.getText()), Integer.parseInt(Den1.getText()));
        Frac sec = new Frac(Integer.parseInt(Num2.getText()), Integer.parseInt(Den2.getText()));
        Frac rez = new Frac().divis(first, sec);
        Ans.setText(rez.toString());
        }
        catch (NumberFormatException ex)
        {

        }
    }

}