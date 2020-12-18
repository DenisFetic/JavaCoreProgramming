package Four;

import javax.swing.*;
//Kontrola toka ->
public class StringSwitchDemo {
    public static void main(String[] args) {
        //Java 7 >=
        //1.try-with-resource
        //2. switch -> prima ne samo broj nego i String
        String imeDana = JOptionPane.showInputDialog("Unesi ime dana u sedmici na Engleskom jeziku:");
        String imeDanaNeosjetljivo = imeDana.toLowerCase();
        int redniBrojDana;
        // 1.7 Java je CASE SENSITIVE
        switch (imeDanaNeosjetljivo){
            case "monday":
                redniBrojDana = 1;
                break;
            case "tuesday":
                redniBrojDana = 2;
                break;
            case "wednesday":
                redniBrojDana = 3;
                break;
            case "thursday":
                redniBrojDana = 4;
                break;
            case "friday":
                redniBrojDana = 5;
                break;
            case "saturday":
                redniBrojDana = 6;
                break;
            case "sunday":
                redniBrojDana = 7;
                break;
            default:
                redniBrojDana = 0;
                break;
        }
        //?  -> if else
        String poruka = redniBrojDana == 0 ? "ne postoji dan na engleskom jeziku "+imeDana:
                "Dan s imenom "+imeDana+" je "+redniBrojDana+". po redu";
        JOptionPane.showMessageDialog( null, poruka);
    }
}
