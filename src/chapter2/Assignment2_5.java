package chapter2;

import java.util.Scanner;

public class Assignment2_5 {
    // Financial application: calculate tips
    // Write a program that reads the subtotal and the gratuity rate and then computes the gratuity and total.

    public static void main(String[] args) {

    //Declare variables from user

    //Make the user enter a gratuity rate and a subtotal
    System.out.println("What is the subtotal in $?: ");
    Scanner input = new Scanner(System.in);
    double subtotal = input.nextDouble();

    //Make the user enter a gratuity rate and a subtotal
    System.out.println("What is the gratuity rate in %?: ");
    double gratuityRate = input.nextDouble();

    double resultGratuity = CalculateGratuity(gratuityRate,subtotal);
    System.out.println("If the subtotal is " + subtotal + " and the gratuity rate is " + gratuityRate + " you must give " + resultGratuity + "$ in tips");

    }

    // method to calculate gratuity
    public static double CalculateGratuity(double gratuityRate, double subtotal){
        double result = (subtotal / 100 )*gratuityRate;
        return result;
    }

}
