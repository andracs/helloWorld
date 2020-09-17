package chapter2;
import java.util.Scanner;

//Refactoring
// Gennemgå og forstå koden.
// Refaktorer klassens navn, variable, metoder og tekster til dansk.
// Træk klassens funktionalitet ud i nye metode(r).
// Kald dine nye metoder fra main() - så vi kan se, at det rent faktisk virker.

public class FahrenheitToCelsius {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        System.out.println("Fahrenheit " + fahrenheit + " is " +
                calculateFahrenheitToCelsius(fahrenheit) + " in Celsius");
    }
    public static double calculateFahrenheitToCelsius(double fahrenheit){
        // Convert Fahrenheit to Celsius
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
