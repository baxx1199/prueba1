
package com.baxx.tallerprogramacion.clss;

import javax.swing.JOptionPane;


public class Numero2 {
    public void imprimir(){
    
        String ing = JOptionPane.showInputDialog(null, "Ingrese un numero");
    
        int num = Integer.parseInt(ing);
        for (int i = 0; i <= num; i=i+3) {
            JOptionPane.showMessageDialog(null,i);
            System.out.println(i);
        }
    }
}
