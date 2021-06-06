/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises;
import java.util.Scanner;

public class PaintCalculator
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        final int conversion = 350; //one gallon covers 350 ft^2

        System.out.print("Length of ceiling in feet: ");
        String input = in.nextLine();
        int length = Integer.parseInt(input);
        System.out.print("Width of ceiling in feet: ");
        input = in.nextLine();
        int width = Integer.parseInt(input);

        int sqFeet = length * width;
        int paint = sqFeet / conversion;
        if((sqFeet % conversion !=0))
        {
            paint++;
        }

        System.out.printf("You will need to purchase %d gallons of paint to cover %d square feet.", paint, sqFeet);
    }
}
