package chapter2;

import java.util.Scanner;

public class Assignment2_3 {
    //    Convert meters into feet
    // 1 meters = 3.2786 feet.

    public static void main(String[] args) {
        //Assignment - Convert double meter to double feet

        //Make the user enter a number in meters
        System.out.print("How many meters do you want to convert to feet?:");
        //metersToFeet = the user input variable
        Scanner input = new Scanner(System.in);
        double metersToFeet = input.nextDouble();

        //Get miles variable
        //Translate it into feet
        double resultInFeet= calculateResultInFeet(metersToFeet);

        //Display the results
        System.out.println("You entered " + metersToFeet + "meter(s)" + " converted to feet it is " + resultInFeet + " feet");
    }

    //method to convert meters to feet
    public static double calculateResultInFeet(double metersToFeet){

        //Declare feet variable
        final double FEET = 3.2786;

        double resultInFeet = metersToFeet*FEET;
        return resultInFeet;
    }
}
