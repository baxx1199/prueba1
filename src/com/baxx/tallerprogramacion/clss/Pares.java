
package com.baxx.tallerprogramacion.clss;

import javax.swing.JOptionPane;


public class Pares { 
    
    public void analizar(){
        String numero = JOptionPane.showInputDialog(null, "Ingresa un numero");
        int num = Integer.parseInt(numero);
        
        if (num % 2 == 0) {
                JOptionPane.showMessageDialog(null, "el numero "+ num+ " es par");
            } else {
                JOptionPane.showMessageDialog(null, "el numero "+ num+ " es impar");
            }
        
    }
}
