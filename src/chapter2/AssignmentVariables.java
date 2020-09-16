package chapter2;

public class AssignmentVariables {
    // Opret en ny java-fil, som indeholder eksempler på alle ovenstående datatyper. Sørg for, at du både skriver
    // værdier i variablen, men også at du læser værdierne fra variablen. Se bogens 2 kapitel for eksempler på
    // datatyper.

    // Data Type	Size	Description
    // byte	1 byte	Stores whole numbers from -128 to 127
    // short	2 bytes	Stores whole numbers from -32,768 to 32,767
    // int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
    // long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    // float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
    // double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
    // boolean	1 bit	Stores true or false values
    // char	2 bytes	Stores a single character/letter or ASCII values

    public static void main(String[] args) {
        //byte
        byte a = 120;
        System.out.println("Byte: " + a);

        //short
        short b = 31;
        System.out.println("Short: " + b);

        //integer
        int c=3;
        System.out.println("Integer: " + c);

        //long
        long d= 9223372036854775807l;
        System.out.println("Long: " + d);

        //float
        float e = 0.333f;
        System.out.println("Float: " + e);

        //double
        double f=53.9999990;
        System.out.println("Double: " + f);

        //boolean
        boolean g=true;
        System.out.println("Boolean: " + g);

        //char
        char h='a';
        System.out.println("Char: " + h);
    }
}
