
package com.baxx.tallerprogramacion.clss;

import javax.swing.JOptionPane;


public class Numero {
    
    
    public void imprimir(){
    
        String ing = JOptionPane.showInputDialog(null, "Ingrese un numero");
    
        int num = Integer.parseInt(ing);
        for (int i = 0; i <= num; i++) {
            JOptionPane.showMessageDialog(null,i);
        }
    }
}
