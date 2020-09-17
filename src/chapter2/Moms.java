package chapter2;
import java.util.Scanner;

// Nogle små opgaver, som fremmer din forståelse af klasser, variable og metoder og refactorering.
//
//Gennemse SalesTax klassen i bogen, og forstå, hvordan det virker.
//
//Refactoring 1: Omskriv SalesTax klassen til dansk (klassenavn Moms, variablenavne på dansk, dansk moms er 25%)
//
//Refactoring 2: Træk momsberegningen ud i sin egen metode plusMoms().
//
//Refactoring 3: Lav en ny metode, der kan beregene tysk moms (16%) plusTyskMoms().
//
//Refactoring 4: Omdøb nu din plusMoms() til plusDanskMoms().

public class Moms {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Indtast en købssum!: ");
        double koebsSum = input.nextDouble();

        double momsBeregningDK = plusDanskMoms(koebsSum);
        double momsBeregningDE = plusTyskMoms(koebsSum);

        System.out.println("Du skal betale $" + momsBeregningDK + " i moms");

        System.out.println("Medmindre du skal betale tysk moms, så skal du kun af med $" + momsBeregningDE + " i moms");

    }
    public static double plusDanskMoms(double koebsSum){
        double momsSatsDK = 0.25;
        double moms =koebsSum*momsSatsDK;
        return moms;
    }
    public static double plusTyskMoms(double koebsSum){
        double momsSatsTysk = 0.16;
        double moms =koebsSum*momsSatsTysk;
        return moms;
    }
}
