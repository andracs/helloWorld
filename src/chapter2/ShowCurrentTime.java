package chapter2;

public class ShowCurrentTime {
    public static void main(String[] args) {
        VisAktuelTid();
    }

    public static void VisAktuelTid(){
        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilisekunder = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSekunder = totalMilisekunder / 1000;

        // Compute the current second in the minute in the hour
        long nuvaerendeSekunder = totalSekunder % 60;

        // Obtain the total minutes
        long totalMinutter = totalSekunder / 60;

        // Compute the current minute in the hour
        long nuvaerendeMinutter = totalMinutter % 60;

        // Obtain the total hours
        long totalTimer = totalMinutter / 60;

        // Compute the current hour
        long nuvaerendeTimer = totalTimer % 24;

        // Display results
        System.out.println("Nuværende tid er " + nuvaerendeTimer + ":"
                + nuvaerendeMinutter + ":" + nuvaerendeSekunder + " GMT");

    }

}