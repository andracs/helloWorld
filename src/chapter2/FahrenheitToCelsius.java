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
        //make the fahrenheit act like an int
        int typecastFahrenheit = (int)fahrenheit;

        System.out.println("Fahrenheit " + typecastFahrenheit + " is " +
                calculateFahrenheitToCelsius(typecastFahrenheit) + " in Celsius");
    }
    public static double calculateFahrenheitToCelsius(int typecastFahrenheit){
        // Convert Fahrenheit to Celsius
        double celsius = (5.0 / 9) * (typecastFahrenheit - 32);
        return celsius;
    }
}
