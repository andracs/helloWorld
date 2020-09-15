package chapter2;
import java.util.Scanner;

public class Assignment2_1 {

    public static void main(String[] args) {
        //Assignment - Convert double mile to double kilometer

        //Make the user enter a number in miles
        System.out.print("How many miles do you want to convert to kilometers?:");
        //milesToKilometers = the user input variable
        Scanner input = new Scanner(System.in);
        double milesToKilometers = input.nextDouble();

        //Get miles variable
        //Translate it into kilometers
        double resultInKilometers= calculateResultInKilometers(milesToKilometers);

        //Display the results
        System.out.println("You entered " + milesToKilometers + "mile(s)" + " converted to kilometer it is " + resultInKilometers + " kilometers");
    }

    //method to convert miles to kilometers
    public static double calculateResultInKilometers(double milesToKilometers){

        final double KILOMETER = 1.6;

        double resultInKilometers = milesToKilometers*KILOMETER;
        return resultInKilometers;
    }
}
