package Four.loop.branching;

import javax.swing.*;

/**
 * demonstraciaj koristenja
 * 1. Break with loop
 * 2. Break Labela with loop
 * 3. Continue
 * 4. Continue LABELA with loop
 */
public class BreakLoopDemo {
    public static void main(String[] args) {
        int [] brojevi = {13, 23, 36, 45, 67, 95, 21,358,25698,254};
        String brojText = JOptionPane.showInputDialog("Unesi broj i okusaj srecu");
        int uneseniBroj = Integer.parseInt(brojText);
        boolean postoji = false;
        for (int broj: brojevi){
            if (uneseniBroj==broj){
                postoji = true;
                break;
            }
        }
        String poruka = postoji ? "Igre na srecu su za tebe jer si sretan":
                "Vise srece drugi put";
        JOptionPane.showMessageDialog(null, poruka);
    }
}
