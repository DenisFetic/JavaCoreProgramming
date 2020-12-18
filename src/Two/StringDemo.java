package Two;

import java.util.Scanner;

/**
 * string (tekst)
 *  + -> zbrajanje
 */
public class StringDemo {
    public static void main(String[] args) {
        String ime = "Denis ";
        String prezime = "Fetic";
        String result = ime+prezime;
        System.out.println(result);

        String name1 = "Denis";
        String name2 = new String("Denis");
        String name3 = "Denis";
        // ==
        System.out.println(name1 == name2);
        System.out.println(name1 == name3);
    }
}
