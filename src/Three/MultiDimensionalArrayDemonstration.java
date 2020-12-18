package Three;

public class MultiDimensionalArrayDemonstration {
    public static void main(String[] args) {
       //Jednodimenzionalni niz
        String[] imena = new String [10];
        imena[0] = "Denis";
        imena[1] = "Dijana";
        imena[2] = "Jasmin";
        imena[3] = "Ljiljana";
        imena[4] = "Mujo";
        imena[5] = "Nermina";
        //Visedimenzionalni niz
        String[][] names = {
               //0
                {"Gospodin", "Gospodja"},
                //1
                {"Smith", "Jones"}
        };
        String gdja = names[0][1]+" "+ names[1][1];
        System.out.println(gdja);
        String gdin = names[0][0]+" " +names[1][0];
        System.out.println(gdin);
   }
}
