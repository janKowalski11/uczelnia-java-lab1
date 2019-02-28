package lab1.calculator.model;
/*
Author: BeGieU
Date: 27.02.2019
*/

import lab1.calculator.interfaces.Printable;


import static lab1.calculator.validators.Validator.checkIfNegative;

public class Triangle extends Figure implements Printable
{
    public static final int sidesCount = 3;

    private final double[] sides = new double[3];


    public Triangle()
    {
        super("triangle");
    }

    public Triangle(double sideA, double sideB, double sideC) throws RuntimeException
    {
        super("triangle");
        checkIfNegative(sideA, sideB, sideC);
        sides[0] = sideA;
        sides[1] = sideA;
        sides[2] = sideA;
    }

    //check if równoboczny
    boolean ifEquilateral()
    {
        return (sides[0] == sides[1]) && (sides[0] == sides[2]);
    }

    @Override
    public void print()
    {
        System.out.println(Figure.DIVIDE_TEXT_CONSOLE_OUTPUT);
        System.out.println("Triangle Desc ");
        System.out.println("side A: " + sides[0]);
        System.out.println("side B: " + sides[1]);
        System.out.println("side C: " + sides[2]);
        System.out.println("perimeter: " + calculatePerimeter());
        System.out.println("area: " + calculateArea());
        System.out.println(Figure.DIVIDE_TEXT_CONSOLE_OUTPUT);
    }

    @Override
    double calculateArea()
    {

        final double halfPerimeter = calculatePerimeter() / 2;

        //wzor herona
        return Math.sqrt(halfPerimeter *
                (halfPerimeter - sides[0]) *
                (halfPerimeter - sides[1]) *
                (halfPerimeter - sides[2]));
    }

    @Override
    double calculatePerimeter()
    {
        return sides[0] + sides[1] + sides[2];
    }

    @Override
    boolean isPrismable()
    {
        //if equilateral then it is "prismable"
        return ifEquilateral();
    }

    public void setSideA(double a) throws RuntimeException
    {
        checkIfNegative(a);
        sides[0] = a;
    }

    public void setSideB(double b) throws RuntimeException
    {
        checkIfNegative(b);
        sides[1] = b;
    }

    public void setSideC(double c) throws RuntimeException
    {
        checkIfNegative(c);
        sides[2] = c;
    }

    public double[] getSides()
    {
        return sides;
    }


}
