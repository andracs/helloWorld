package chapter2;

public class ComputeWithMethod {

    public static void main(String[] args) {
        //Konkatenering - kæde
        String beregningstType = "areal";
        System.out.println("Beregner" + beregningstType + " med medtoder");

        System.out.println("Arealet for radius 2 er " + beregnAreal(3));
        System.out.println("Arealet for radius 5 er " + beregnAreal(5));
        System.out.println("Arealet for radius 7 er " + beregnAreal(7));
        System.out.println("Arealet for radius 9 er " + beregnAreal(9));

        double toCirkler= beregnAreal(3) + beregnAreal(5);
        System.out.println("Summen af arealet af 2 cirkler: " + toCirkler);
    }

//    Metoder er ligesom kasser, en opskrift for noget der kan gentages.
//    input -  double radius.
//    method - beregn areal - ikke synlig for brugeren.
//    output - double arealet - return svarer til output.

    public static double beregnAreal(double radius){
        double areal = radius*radius*Math.PI;
        return areal;
    }
}
