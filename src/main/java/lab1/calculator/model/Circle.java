package lab1.calculator.model;
/*
Author: BeGieU
Date: 27.02.2019
*/

import lab1.calculator.interfaces.Printable;

import static lab1.calculator.validators.Validator.checkIfNegative;

public class Circle extends Figure implements Printable
{
    private double radius;

    public Circle()
    {
        super("triangle");
    }

    public Circle(double radius) throws RuntimeException
    {
        super("triangle");

        checkIfNegative(radius);
        this.radius = radius;
    }

    @Override
    public void print()
    {
        System.out.println(Figure.DIVIDE_TEXT_CONSOLE_OUTPUT);
        System.out.println("Circle Desc ");
        System.out.println("radius: " + radius);
        System.out.println("perimeter: " + calculatePerimeter());
        System.out.println("area: " + calculateArea());
        System.out.println(Figure.DIVIDE_TEXT_CONSOLE_OUTPUT);
    }

    @Override
    double calculateArea()
    {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double calculatePerimeter()
    {
        return 2 * Math.PI * radius;
    }

    @Override
    boolean isPrismable()
    {
        //circle cannot be a base for any prism
        return false;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius) throws RuntimeException
    {
        checkIfNegative(radius);
        this.radius = radius;
    }

    public static void main(String[] args)
    {
        try
        {
            Circle circle=new Circle(-1);
        }
        catch (Exception e)
        {

        }
    }
}
