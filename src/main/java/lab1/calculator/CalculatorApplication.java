package lab1.calculator;

import lab1.calculator.view.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class CalculatorApplication
{
    private static final Menu menu = new Menu();

    public static void main(String[] args)
    {
        menu.userInterface();
    }

}
