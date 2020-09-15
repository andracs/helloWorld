package chapter2;

import java.util.Scanner;

public class Assignment2_2 {
    //Compute the volume of a triangle
    //Write a program that reads in the length of sides of an equilateral triangle and compute the area and volume
    // using the following formulas:
    //area = square3 /4 (length of sides)^2
    //Volume = area * lenght (height)

    public static void main(String[] args) {

        //Make the user enter a side length and height
        System.out.print("What are the sides of the triangle?: ");
        //sidesOfTriangle = the user input variable
        Scanner input = new Scanner(System.in);
        double sidesOfTriangle = input.nextDouble();

        System.out.print("What are the height of the triangle?: ");
        //heightOfTriangle = the user input variable
        double heightOfTriangle = input.nextDouble();

        //Declare variables
        double resultArea= calculateArea(sidesOfTriangle);
        double resultVolume= calculateVolume(resultArea, heightOfTriangle);

        //Display the results for area
        System.out.println("You entered " + sidesOfTriangle + " as the sides of the triangle then the area is " + resultArea);

        //Display the results for volume
        System.out.println("You entered " + heightOfTriangle + " as the height of the triangle then the volume is " + resultVolume);
    }

    //method to convert miles to kilometers
    public static double calculateArea(double sidesOfTriangle){
        double area = (((Math.sqrt(3))/4))*((sidesOfTriangle*sidesOfTriangle));
        return area;
    }
    public static double calculateVolume(double area, double heightOfTriangle){
        double volume = area * heightOfTriangle;
        return volume;
    }
}