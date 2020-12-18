package Four;

import javax.swing.*;

/**
 * Program:
 * Broj Mjeseca  u godini (12).
 * Broj godine. (28, 29).
 *
 * Program izbaci koliko mjesec ima dana. (28,29,30,31).
 */
public class SwitchDemo2 {
    public static void main(String[] args) {
        //ulaz u program
        String redniBrojMjesecaTxt = JOptionPane.showInputDialog("Unesi Broj Mjeseca");
        int redniBrojMjeseca = Integer.parseInt(redniBrojMjesecaTxt);
        String redniBrojGodineTxt = JOptionPane.showInputDialog("Unesi Godinu");
        int redniBrojGodine = Integer.parseInt(redniBrojGodineTxt);
        //Logika programa
        int brojDanaUMjesecu = 0;
        switch (redniBrojMjeseca){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                brojDanaUMjesecu = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                brojDanaUMjesecu = 30;
                break;
            case 2:
                //Godine djeljive sa 4 a ne sa 100 -> ==0 && !=
                boolean condition1 = redniBrojGodine % 4==0 && redniBrojGodine % 100!=0;
                //DODAJU SE i one djeljive sa 400 -> ==0
                boolean condition2 = redniBrojGodine % 400 == 0;
                boolean prestupna = condition1 || condition2;
                if (prestupna){
                    brojDanaUMjesecu = 29;
                }else {
                    brojDanaUMjesecu = 28;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Godina ima 12 mjeseci!");
                break;
        }
        //Izlaz iz programa 1 i 2 poruka (2 nacina pisanja)
        String message = "Za uneseni mjesec '"+ redniBrojMjeseca+"' i godinu '"
                +redniBrojGodine + "' Broj dana u mjesecu je '" +brojDanaUMjesecu+"'";
        String message1 = String.format("Za uneseni mjesec '%d' i godinu '%d' " +
                "broj dana u mjesecu je '%d'", redniBrojMjeseca, redniBrojGodine, brojDanaUMjesecu);
        JOptionPane.showMessageDialog(null, message1);
    }
}
