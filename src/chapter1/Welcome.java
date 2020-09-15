package chapter1;

public class Welcome {

    public static void main(String[] args) {

        // Display message chapter1.Welcome to Java! on the console
        System.out.println("chapter1.Welcome to Java!");

        hej("Mikkel");
        goNat("Anders");

    }
//Her er et eksempel på en metode
    public static void hej(String navn) {

        System.out.println("Hej " + navn  + "!");

    }
//Her er et eksempel på en  anden metode
    public static void goNat(String navn) {

        System.out.println("Godnat " + navn  + "!");

    }

}
