package Three.ControlFlow;

import javax.swing.*;
import java.util.ArrayList;

public class SwitchCaseNoBreak {
    public static void main(String[] args) {
        String brojDanaTxt = JOptionPane.showInputDialog("Unesi broj dana u sedmici");
        int brojDana = Integer.parseInt(brojDanaTxt);
        ArrayList<String> dinamickiNiz = new ArrayList<String>();
        switch (brojDana){
            case 1:
                dinamickiNiz.add("Monday");
            case 2:
                dinamickiNiz.add("Tuesday");
            case 3:
                dinamickiNiz.add("Wednesday");
            case 4:
                dinamickiNiz.add("Thursday");
            case 5:
                dinamickiNiz.add("Friday");
            case 6:
                dinamickiNiz.add("Saturday");
            case 7:
                dinamickiNiz.add("Sunday");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Cestitam");
        }
        dinamickiNiz.forEach(System.out::println);

    }
}
