package chapter2;

public class ComputeArea {
    public static void main(String[] args) {

        double a; // variable
        double r; //variable
        final double pi = 3.14159; //konstant
        String programTitle = "Areal-beregner";
        boolean erDuGlad = true;
        int heltTal = 9;

        //Assign a radius
        r = 5.2;

        //Compute area
        a = r * r * pi;

        //Display result
        System.out.println(programTitle);
        System.out.println("Arealet af cirklen er " + a);
        System.out.println("Er du glad? " + erDuGlad);
    }
}
