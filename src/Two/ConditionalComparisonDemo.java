package Two;

public class ConditionalComparisonDemo {
    public static void main(String[] args) {
        int value1= 2;
        int value2 = 3;
        if ((value1 ==2) && (value1 > value2)){
            System.out.println("Value1 je 2 a i value2 je sigurno manje od 1");
        }
        if ((value1 == 2) || (value2 == 2)){
            System.out.println("jedna od dvije vrijednosti je garant dvojka");
        }
        value2++;
        System.out.println("Value2 == 4 " + "Da li je rezultat 4 ? Rezultat:" + value2);
    }
}
