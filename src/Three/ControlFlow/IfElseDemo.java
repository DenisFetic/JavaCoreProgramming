package Three.ControlFlow;

import javax.swing.*;
/**
 * Kontrola toka:
 * 1.if-then, if-then-else, switch-case
 * 2
 */
public class IfElseDemo {
    public static void main(String[] args) {
        String brojPoenaString = JOptionPane.showInputDialog("Broj poena");
        int brojPoena = Integer.parseInt(brojPoenaString);
        char grade;
        if (brojPoena>=90){
            grade = 'A';
        }else if(brojPoena>=80){
            grade = 'B';
        }else if(brojPoena>=70){
            grade = 'C';
        }else if(brojPoena>=60){
            grade = 'D';
        }else{
            grade = 'F';
        }
        JOptionPane.showMessageDialog(null, "Ocjena  na ispitu:" +grade);
    }
}
