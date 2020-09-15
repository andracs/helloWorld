package chapter2;

import java.util.Scanner;

public class Assignment2_6 {
    //Multiply the digits in an integer
    // Write a program that reads an integer between 0 and 1000 and multiplies all the digits in the integer.
    // Hint: use the % operator to extract the digits, and use the / operator to remove the extract digit.

    public static void main(String[] args) {
        System.out.println("Enter a number between 0 and 1000: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int firstDigit = number % 10;
        int remainingDigit = number / 10;
        int secondDigit = remainingDigit % 10;
        remainingDigit = remainingDigit / 10;

        int thirdDigit = remainingDigit % 10;

        if(firstDigit == 0){
            firstDigit = 1;
        }
        if(secondDigit == 0){
            secondDigit = 1;
        }
        if(thirdDigit == 0){
            thirdDigit = 1;
        }

        System.out.println("The result of the multiplication is: " + resultMultiplication(firstDigit, secondDigit, thirdDigit));
    }

    public static int resultMultiplication(int firstDigit, int secondDigit, int thirdDigit){
        int result = firstDigit * secondDigit * thirdDigit;
        return result;
    }
}
