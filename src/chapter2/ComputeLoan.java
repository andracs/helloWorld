package chapter2;

import java.util.Scanner;

public class ComputeLoan {
    public static void main(String[] args) {

        // Lav en Scanner
        Scanner input = new Scanner(System.in);

        // Skriv en årlig rente
        System.out.print("Skriv en årlig rente, fx 8,25: ");
        double aarligRente = input.nextDouble();

        // Få månedlig rente
        double maanedligRente = aarligRente / 1200;

        // Skriv Løbetid på lånet i år:
        System.out.print(
                "Skriv hvor mange år du ønsker, at dit lån skal løbe over, fx 5: ");
        int antalAarLoebetid = input.nextInt();

        // Skriv lånebeløbet
        System.out.print("Skriv det beløb, som du ønsker at låne, fx 120000,95: ");
        double laaneBeloeb = input.nextDouble();

        double maanedligAfdragResultat = udregnLaanMaanedligAfdrag(laaneBeloeb, maanedligRente, antalAarLoebetid);
        double totalUdbetalingsbeloebResultat = udregnLaanAArligAfdrag(maanedligAfdragResultat, antalAarLoebetid);


        // Vis resultatet
        System.out.println("Månedlig afdrag er $" +
                (int)(maanedligAfdragResultat * 100) / 100.0);
        System.out.println("Totale afdrag er $" +
                (int)(totalUdbetalingsbeloebResultat * 100) / 100.0);
    }

    public static double udregnLaanMaanedligAfdrag(double laaneBeloeb, double maanedligRente, int antalAarLoebetid) {
        // Calculate payment
        double maanedligAfdrag = laaneBeloeb * maanedligRente /(1
                - 1 / Math.pow(1 + maanedligRente, antalAarLoebetid *12));
        return  maanedligAfdrag;
    }
    public static double udregnLaanAArligAfdrag(double maanedligAfdrag, int antalAarLoebetid){
        double totalAfdrag = maanedligAfdrag * antalAarLoebetid * 12;
        return totalAfdrag;
    }
}