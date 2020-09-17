package chapter2;
import java.util.Scanner;

//Refactoring
// Gennemgå og forstå koden.
// Refaktorer klassens navn, variable, metoder og tekster til dansk.
// Træk klassens funktionalitet ud i nye metode(r).
// Kald dine nye metoder fra main() - så vi kan se, at det rent faktisk virker.

public class DisplayTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt the user for input
        System.out.print("Indtast et helt talt for sekunder: ");
        int sekunder = input.nextInt();

        double resultatMinutter = OmregnSekunderTilMinutterMinutter(sekunder);
        double resultatSekunder = OmregnSekunderTilMinutterSekunder(sekunder);

        System.out.println(sekunder + " sekunder er " + resultatMinutter +
                " minutter og " + resultatSekunder + " sekunder");
    }

    public static double OmregnSekunderTilMinutterMinutter(int sekunder){
        int minutter = sekunder / 60; // Omregn minutter til sekunder
        return minutter;
    }

    public static double OmregnSekunderTilMinutterSekunder(int sekunder){
        double resterendeSekunder = sekunder % 60; // Seconds remaining
        return resterendeSekunder;
    }
}