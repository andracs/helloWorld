package chapter2;
import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args) {

        udregnByttepenge();

    }
    public static void udregnByttepenge(){

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Modtag beløbet
        System.out.print(
                "Skriv i double beløbet, fx 11,56: ");
        double beloeb = input.nextDouble();

        int tilbagevaerendeBeloeb = (int)(beloeb * 100);

        // Find the number of one dollars
        int antalEnDollars = tilbagevaerendeBeloeb / 100;
        tilbagevaerendeBeloeb = tilbagevaerendeBeloeb % 100;

        // Find the number of quarters in the remaining beloeb
        int antalOneQuarters = tilbagevaerendeBeloeb / 25;
        tilbagevaerendeBeloeb = tilbagevaerendeBeloeb % 25;

        // Find the number of dimes in the remaining beloeb
        int antalAfDimes = tilbagevaerendeBeloeb / 10;
        tilbagevaerendeBeloeb = tilbagevaerendeBeloeb % 10;

        // Find the number of nickels in the remaining beloeb
        int antalAfNickels = tilbagevaerendeBeloeb / 5;
        tilbagevaerendeBeloeb = tilbagevaerendeBeloeb % 5;

        // Find the number of pennies in the remaining beloeb
        int antalAfPennies = tilbagevaerendeBeloeb;


        // Display results
        System.out.println("Dit beløb " + beloeb + " består af");
        System.out.println("    " + antalEnDollars + " dollars");
        System.out.println("    " + antalOneQuarters + " quarters ");
        System.out.println("    " + antalAfDimes + " dimes");
        System.out.println("    " + antalAfNickels + " nickels");
        System.out.println("    " + antalAfPennies + " pennies");

    }
}