package chapter2;

import java.util.Scanner; //Importer scanner til Java - ekstra pakke

public class HejDu {
    public static void main(String[] args) {

        //Beder brugeren om deres navn, ved at scanne for input

        //De her tre linjer tilsammen indlæser en string
        System.out.print("Skriv dit navn:");
        Scanner input = new Scanner(System.in);
        String navn = input.next();

        System.out.println("Hej " + navn + "!");

        //Eksempel på indlæsning af tal
//        System.out.print("Skriv radius:");
//        int radius = input.nextInt();
    }
}
