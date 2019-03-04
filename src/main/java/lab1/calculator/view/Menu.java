package lab1.calculator.view;
/*
Author: BeGieU
Date: 28.02.2019
*/

import lab1.calculator.model.Circle;
import lab1.calculator.model.Prism;
import lab1.calculator.model.Square;
import lab1.calculator.model.Triangle;

import java.util.Scanner;

public class Menu
{
    private final Scanner keyboard = new Scanner(System.in);
    private String choice = "start";


    private void printMenu()
    {
        System.out.println("**********HELLO*********");
        System.out.println("\t wybierz figurę");
        System.out.println("1: koło");
        System.out.println("2: kwadrat");
        System.out.println("3: trojkat");
        System.out.println("4: graniastosłup\n\n");
        System.out.println("5: KONIEC");
        System.out.print("TWOJ WYBOR: ");
        choice = keyboard.next();
        System.out.println("************************");
    }


    public void userInterface()
    {
        while (!choice.equals("end"))
        {
            printMenu();
            switch (choice)
            {
                case "1":
                    handleFirstCase();
                    break;
                case "2":
                    handleSecondCase();
                    break;
                case "3":
                    handleThirdCase();
                    break;
                case "4":
                    handleFourthCase();
                    break;
                case "5":
                    choice = "end";
                    break;
                default:
                    System.out.println("podales zle dane");
                    break;
            }
        }
    }

    private void handleFirstCase()
    {
        try
        {
            System.out.print("podaj dlugosc promienia: ");
            double radius = keyboard.nextDouble();
            Circle circle = new Circle(radius);
            circle.print();
            userInterface();
        }
        catch (Exception e)
        {
            System.out.println("podales zle dane -> wracam do menu glownego: ");
            userInterface();
        }

    }

    private void handleSecondCase()
    {
        try
        {
            System.out.print("podaj dlugosc boku: ");
            double side = keyboard.nextDouble();
            Square square = new Square(side);
            square.print();
            userInterface();
        }
        catch (Exception e)
        {
            System.out.println("podales zle dane -> wracam do menu glownego: ");
            userInterface();
        }
    }

    private void handleThirdCase()
    {
        try
        {
            System.out.print("podaj dlugosc boku A: ");
            double sideA = keyboard.nextDouble();

            System.out.print("podaj dlugosc boku B: ");
            double sideB = keyboard.nextDouble();

            System.out.print("podaj dlugosc boku B: ");
            double sideC = keyboard.nextDouble();

            Triangle triangle = new Triangle(sideA, sideB, sideC);
            triangle.print();
            userInterface();
        }
        catch (Exception e)
        {
            System.out.println("podales zle dane -> wracam do menu glownego: ");
            userInterface();
        }
    }

    private void handleFourthCase()
    {
        try
        {
            System.out.println("Wybierz podstawe graniasoslupa ");
            System.out.println("1:  trojkat ");
            System.out.println("2:  kwadrat\n\n");
            System.out.println("3:  Menu Glowne");
            int choice = keyboard.nextInt();

            if (choice == 1)
            {
                System.out.print("Podaj dlugosc boku trojkata(musi byc rownoboczny): ");
                final double side = keyboard.nextDouble();
                final Triangle triangle = new Triangle(side, side, side);

                System.out.print("Podaj wysokosc graniastoslupa: ");
                final double height = keyboard.nextDouble();

                Prism prism = new Prism(triangle, height);
                prism.print();
                userInterface();
            }
            else if (choice == 2)
            {
                System.out.print("Podaj dlugosc boku kwadratu");
                final double side = keyboard.nextDouble();
                final Square square = new Square(side);

                System.out.print("Podaj wysokosci graniastoslupa: ");
                final double height = keyboard.nextDouble();

                Prism prism = new Prism(square, height);
                prism.print();
                userInterface();
            }
            else if (choice == 3)
            {
                userInterface();
            }
            else
            {
                System.out.println("nie wybrales ani 1 ani 2 ani 3, wybierz jeszcze raz");
                handleFourthCase();
            }
        }
        catch (Exception e)
        {
            System.out.println("podales zle dane -> wracam do menu glownego: ");
            userInterface();
        }
        // final Prism prism = new Prism()
    }

    public static void main(String[] args)
    {
        //        Scanner scanner= new Scanner(System.in);
        //        final int i= scanner.nextInt();
    }
}
