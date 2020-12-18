package Three.ControlFlow;

import javax.swing.*;

/**
 * switch -case -break
 * switch - case bez break
 */
public class SwitchCaseDemo {
    public static void main(String[] args) {
        String weekDaysTxt = JOptionPane.showInputDialog("Unesi od 1-7:");
        int numberDay = Integer.parseInt(weekDaysTxt);
        String nameOfDay;
        switch (numberDay){
            case 1:
                nameOfDay = "Monday";
                break;
            case 2:
                nameOfDay = "Tuesday";
                break;
            case 3:
                nameOfDay = "Wednesday";
                break;
            case 4:
                nameOfDay = "Thursday";
                break;
            case 5:
                nameOfDay = "Friday";
                break;
            case 6:
                nameOfDay = "Saturday";
                break;
            case 7:
                nameOfDay = "Sunday";
                break;
            default:
                nameOfDay = "You input value more than one to seven!";


        }
        JOptionPane.showMessageDialog(null,nameOfDay);

    }
}
