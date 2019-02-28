package lab1.calculator.model;
/*
Author: BeGieU
Date: 27.02.2019
*/

import lab1.calculator.interfaces.Printable;

import static lab1.calculator.validators.Validator.checkIfNegative;

public class Square extends Figure implements Printable
{
    public static final int sidesCount=4;

    private double side;

    public Square()
    {
        super("square");
    }

    public Square(double val) throws RuntimeException
    {
        super("square");

        checkIfNegative(val);
        this.side = val;
    }

    @Override
    public void print()
    {
        System.out.println(Figure.DIVIDE_TEXT_CONSOLE_OUTPUT);
        System.out.println("Square Desc ");
        System.out.println("side: " + side);
        System.out.println("perimeter: " + calculatePerimeter());
        System.out.println("area: " + calculateArea());
        System.out.println(Figure.DIVIDE_TEXT_CONSOLE_OUTPUT);
    }

    @Override
    double calculateArea()
    {
        return Math.pow(side, 2);
    }

    @Override
    double calculatePerimeter()
    {
        return 4 * side;
    }

    @Override
    boolean isPrismable()
    {
        //square is always able to be base for prism
        return true;
    }

    public double getSide()
    {
        return side;
    }

    public void setSide(double side) throws RuntimeException
    {
        checkIfNegative(side);
        this.side = side;
    }
}
