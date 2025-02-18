package com.inessa.fractions;

public class Frac {
    private int num;
    private int den;

    public Frac()
    {
        num = 0;
        den = 1;
    }

    public Frac(int numinator, int denominator)
    {
        setNum(numinator);
        setDen(denominator);
    }

    public void setNum(int num)
    {
        this.num = num;
    }

    public void setDen(int denom)
    {
        if (denom != 0)
        {
            den = denom;
        }
        else {
            den = 1;
        }
    }

    public int getNum()
    {
        return num;
    }

    public int getDen()
    {
        return den;
    }

    @Override
    public String toString()
    {
        return num + "/" + den;
    }

    public Frac summ(Frac first_frac, Frac second_frac)
    {
        Frac rez = new Frac();
        if (first_frac.getDen() != second_frac.getDen())
        {
            int new_den = first_frac.getDen() * second_frac.getDen();
            int new_num1 = first_frac.getNum() * second_frac.getDen();
            int new_num2 = second_frac.getNum() * first_frac.getDen();
            rez.setDen(new_den);
            rez.setNum(new_num1 + new_num2);
        }
        else
        {
            rez.setDen(first_frac.getDen());
            int num1 = first_frac.getNum();
            int num2 = second_frac.getNum();
            rez.setNum(num1 + num2);
        }
        return rez;
    }

    public Frac comp(Frac first_frac, Frac second_frac)
    {
        Frac rez = new Frac();
        int new_num = first_frac.getNum() * second_frac.getNum();
        int new_den = first_frac.getDen() * second_frac.getDen();
        rez.setNum(new_num);
        rez.setDen(new_den);
        return rez;
    }

    public Frac minus(Frac first_frac, Frac second_frac)
    {
        Frac rez = new Frac();
        if (first_frac.getDen() != second_frac.getDen())
        {
            int new_den = first_frac.getDen() * second_frac.getDen();
            int new_num1 = first_frac.getNum() * second_frac.getDen();
            int new_num2 = second_frac.getNum() * first_frac.getDen();
            rez.setDen(new_den);
            rez.setNum(new_num1 - new_num2);
        }
        else
        {
            rez.setDen(first_frac.getDen());
            int num1 = first_frac.getNum();
            int num2 = second_frac.getNum();
            rez.setNum(num1 - num2);
        }
        return rez;
    }

    public Frac divis(Frac first_frac, Frac second_frac)
    {
        Frac rez = new Frac();
        int new_num = first_frac.getNum() * second_frac.getDen();
        int new_den = first_frac.getDen() * second_frac.getNum();
        if (new_den != 0)
        {
            rez.setNum(new_num);
            rez.setDen(new_den);
            return rez;
        }
        else
        {
            throw new RuntimeException();
        }
    }


}
