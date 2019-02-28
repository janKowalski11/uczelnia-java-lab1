package lab1.calculator.model;
/*
Author: BeGieU
Date: 27.02.2019
*/

abstract class Figure
{
    private final String type;

    static final String DIVIDE_TEXT_CONSOLE_OUTPUT = "=============================";


    Figure(String type)
    {
        this.type = type;
    }

    //tells if figure is suitable to be prism's base
    abstract boolean isPrismable();

    String getType()
    {
        return type;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();




}
