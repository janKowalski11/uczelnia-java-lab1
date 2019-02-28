package lab1.calculator.validators;
/*
Author: BeGieU
Date: 28.02.2019
*/

public class Validator
{
    public static void checkIfNegative(Number... number) throws IllegalArgumentException
    {
        for (Number val : number)
        {
            if (val.doubleValue() < 0)
            {
                throw new IllegalArgumentException("You are trying to assign negative value to radius or side");
            }
        }
    }
}
