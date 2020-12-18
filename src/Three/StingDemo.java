package Three;

/**
 * Tipovi podataka
 *      1.Prosti
 *      2.Slozeni ili objektivni (String, nizovi)
 */
public class StingDemo {
    public static void main(String[] args) {
        //tip ime = vrijednos
        int number = 13;
        char znak = 'A';
        //mora se deklarirati tip jednom a onda mozes mjenjati bez deklaracije tipa
        //tip ime = vrijednost
        znak = '!';
        String ime = "Denis";
        String prezime = "Fetic";
        String punoIme = ime + prezime;
        punoIme = punoIme +" Nesto";
        // == koristi se kod prostih tipova
        String name1 = "Denis";//1.String literal
        String name2 = new String("Denis");
        System.out.println(name1==name2);
        String name3 = "Denis";
        System.out.println(name1==name3);
        System.out.println(name1.equals(name2));
        System.out.println(name1.equals(name3));
    }
}
