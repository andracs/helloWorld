package chapter2;

import java.util.Scanner;

public class Assignment2_7 {
    //Find the number of years. Write a program that prompts the user to enter the minutes (e.g. billion), and display
    // the number og years remaining days for the minutes. One year = 365 days.
    // Convert from minutes to years and days.

    public static void main(String[] args) {

        System.out.println("Enter the number of minutes: ");
        Scanner input = new Scanner(System.in);
        double minutes = input.nextDouble();

        System.out.println("You entered " + minutes);
        System.out.println("That is approximately " + MinutesConvertedIntoYears(minutes) + " years");

        System.out.println("Left is " + RemainingDaysLessThanAYear(minutes) + " days");
        System.out.println(MinutesConvertedIntoYears(minutes));
    }

    public static double MinutesConvertedIntoYears(double minutes){
        final int HOUR = 60; // 60 minutter
        final int DAY = 60*24; // 24timer*60minutter
        final int HOURSINONEDAY = 24*365;
        final int MINUTESINAYEAR =  60*24*365;

        double resultOfYears = (((minutes/60)/24)/365);
        return resultOfYears;
    }
    public static double RemainingDaysLessThanAYear(double minutes){
        double resultOfDays = (MinutesConvertedIntoYears(minutes)%365);
        return resultOfDays;
    }

    //Not done yet :)
}
