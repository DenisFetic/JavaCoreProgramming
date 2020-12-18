package Four.loop;

/**
 * while loop (loop = petlja)
 * za while petlju uvijek uzima boolean vrijednost (true i fals)
 * PETLJA (Loop) ->blok koda koji se ponavlja sve dok je zadovoljen uslov petlje
 */
public class WhileDemo {
    public static void main(String[] args) {
        int number = 1; //initialization
        while (number<=100){ //uslov petlje
            System.out.println(number);
            number++; //korak petlje
        }
    }
}
