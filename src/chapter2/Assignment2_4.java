package chapter2;

import java.util.Scanner;

public class Assignment2_4 {
    //Convert square meters into ping
    // 1 square meter = 0.3025 pings

    public static void main(String[] args) {
        //Assignment - Convert double square meters to double pings

        //Make the user enter a number in square meters
        System.out.print("How many square meters do you want to convert to pings?:");
        //squareMetersToPings = the user input variable
        Scanner input = new Scanner(System.in);
        double squareMetersToPings = input.nextDouble();

        //Get square meter variable
        //Translate it into pings
        double resultInPings= calculateResultInPings(squareMetersToPings);

        //Display the results
        System.out.println("You entered " + squareMetersToPings + " square meter(s) converted to pings it is " + resultInPings + " ping(s)");
    }

    //method to convert meters to feet
    public static double calculateResultInPings(double squareMetersToPings){
        //Declare ping variable
        final double PING = 0.3025;

        double resultInPings = squareMetersToPings*PING;
        return resultInPings;
    }
}
