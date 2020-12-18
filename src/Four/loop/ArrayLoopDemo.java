package Four.loop;

public class ArrayLoopDemo {
    public static void main(String[] args) {
        String [] names = {"Dijana", "Jasmin", "Mujo", "Nermina", "Denis",
                "Ljiljana", "Marko", "Ivana", "Maja", "Dino", "Irena", "Dani",};
        /*int i = 0;
        while (i<names.length){
            String name = names [i];        1 nacin
            System.out.println(name);
            i++;
        }
        for (int i = 0; i<names.length; i++){
            String name = names [i];        2 nacin
            System.out.println(name);
        }*/
        //Enhanceds for LOOP -> Java
        for (String name: names) {         //3 nacin
            System.out.println(name);
        }

    }
}
