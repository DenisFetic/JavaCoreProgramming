package Two;

/**
 * Unarni operatori:
 * 1.  +
 * 2.  -
 * 3. INKREMENT (++)(uvecava vrijednost za 1)
 *          Post inkrement
 *          Pre inkrement
 * 4. DEKREMENT (--) (umanjuje vrijednost za 1)
 *          Post dekrement
 *          Pre dekrement
 * 5. ! -> Logicki komplement
 *
 */
public class UnaryOperatorDemo {
    public static void main(String[] args) {
        int result = 1;
        System.out.println(++result);//pre inkrement
        System.out.println(result);
        result = 1;
        System.out.println(result--);//post dekrement
        System.out.println(result);

        boolean uspjeh = false;
        System.out.println(!uspjeh);
    }
}
