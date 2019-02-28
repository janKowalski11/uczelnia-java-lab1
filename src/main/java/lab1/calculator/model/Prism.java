package lab1.calculator.model;
/*
Author: BeGieU
Date: 27.02.2019
    wzory uzyte do calculateArea() i calculatePerimeter():
    https://pl.wikipedia.org/wiki/Graniastos%C5%82up
*/

import lab1.calculator.interfaces.Printable;

public class Prism implements Printable
{
    private Figure base;
    private int baseSidesCount;
    private double baseSideLength;

    private double height;

    public Prism(Figure base, double height)
    {

        if (!base.isPrismable())
        {
            throw new IllegalArgumentException("this object cannot be base for prism:" + base.toString());
        }
        else if (base.getType().equals("square"))
        {
            baseSidesCount = 4;

            Square square = (Square) base;
            baseSideLength = ((Square) base).getSide();
        }
        else if (base.getType().equals("triangle"))
        {
            baseSidesCount = 3;
            //sides are even, because it's prismable (rownoboczny trojkat)
            baseSideLength = ((Triangle) base).getSides()[0];
        }
        else
        {
            throw new RuntimeException("unknown type of figure !!!: " + base.getType());
        }


        this.base = base;
        this.height = height;
    }

    @Override
    public void print()
    {
        System.out.println("==========");
        System.out.println("Prism Desc ");
        System.out.println("base: " + base.getType());
        System.out.println("height: " + height);
        System.out.println("area: " + calculateArea());
        System.out.println("volume: " + calculateVolume());
        System.out.println("==========");
    }

    public double calculateArea()
    {
        return 2 * base.calculateArea() + baseSidesCount * height * baseSideLength;
    }

    public double calculateVolume()
    {
        return base.calculateArea() * height;
    }


}
