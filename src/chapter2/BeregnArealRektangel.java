package chapter2;

public class BeregnArealRektangel {
    public static void main(String[] args) {
        //Lav en metode der beregner arealet af et rektangel.

        //Kald metode fra din main() med værdierne
        // a=2 b=5
        // a=6 b=12

        int a;
        int b;

        //Vis resultaterne
        int beregnAreal= beregnAreal(2, 5);
        System.out.println("Hvis a=2 og b=5");
        System.out.println("Er arealet af rektanglen: " + beregnAreal);

        System.out.println("");

        System.out.println("Hvis a=6 og b=12");
        System.out.println("Er arealet af rektanglen: " + beregnAreal(6,12));

    }
    //Metoden
    public static int beregnAreal(int a, int b){
        int areal = a*b;
        return areal;
    }
}