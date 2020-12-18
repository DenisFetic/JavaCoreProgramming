package Two;

import java.util.Scanner;

/**
 * Aitmeticki operatori:
 * 1.  +  Additive (tekst spajanje, a brojeve sabiranje)
 * 2.  -  Subtraction (oduzimanje)
 * 3.  *  Multiplication (Mnozenje)
 * 4.  /  Division (Djeljenje)
 * 5.  %  Modulo
 */
public class ArithmeticDemo {
    public static void main(String[] args) {
        System.out.println("Unesi Prvi Broj:");
        int broj1 = new Scanner(System.in).nextInt();
        System.out.println("Unesi Drugi Broj:");
        int broj2 = new Scanner(System.in).nextInt();
        int suma = broj1 + broj2;
        System.out.println("Suma=" + suma);
        System.out.println("Unesi Prvi Broj:");
        int broj3 = new Scanner(System.in).nextInt();
        System.out.println("Unesi Drugi Broj:");
        int broj4 = new Scanner(System.in).nextInt();
        int Razlika = broj3 - broj4;
        System.out.println("Razlika=" + Razlika);
        int moduloRezultat = broj1 % broj2;
        System.out.println("Modulo rezultat =" +moduloRezultat);

    }
}
