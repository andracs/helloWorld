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

        System.out.print("Indtast temperaturen i fahrenheit: ");
        double fahrenheit = input.nextDouble();

        System.out.println("Fahrenheit " + fahrenheit + " er " +
                beregnFahrenheitTilGraderCelsius(fahrenheit) + " i grader celsius");
    }
    public static double beregnFahrenheitTilGraderCelsius(double fahrenheit){
        // Omregner Fahrenheit til Celsius
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
