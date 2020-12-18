package Two;

import java.util.Scanner;

/**
 * Operatori poredjenja.
 * 1. == equal
 * 2 !=  not equal
 * 3. > Greater
 * 4. < Smaller
 * 5. >= Greaer or equal
 * 6. <= Smaller or equal
 */
public class ComparisonDemoi {
    public static void main(String[] args) {
        System.out.println("Unesi prvu vrijednos:");
        int value1 = new Scanner(System.in).nextInt();
        System.out.println("Unesi drugu vrijednost:");
        int value2 = new Scanner(System.in).nextInt();
        boolean equality = value1 ==value2;
        if(equality){
            System.out.println("Jednake vrijednosti");
        }
        if(value1 != value2){
            System.out.println("Nejednake vrijednosti");
        }
        if(value1 < value2){
            System.out.println("Prva manja od doruge vrijednosti");
        }
        if(value1 <= value2){
            System.out.println("Prva manja ili jednaka drugoj vrijednosti");
        }
        if(value1 > value2){
            System.out.println("Prva veca od druge vrijednosti");
        }
        if(value1 >= value2){
            System.out.println("prva veca ili jednaka od druge vrijednosti");
        }
    }
}
