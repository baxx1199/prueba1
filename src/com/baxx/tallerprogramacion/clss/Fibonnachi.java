
package com.baxx.tallerprogramacion.clss;

import javax.swing.JOptionPane;


public class Fibonnachi {
    
    public void secuencia(){
        JOptionPane.showMessageDialog(null, "Serie de Fibonnachi");
        String limite = JOptionPane.showInputDialog(null, "ingresa el numero limite de la serie");
        int num = Integer.parseInt(limite);
        int a = 0, b=1, c;
        System.out.println(a);
        do{
            
            c= a+b;
            a=b;
            b=c;
            System.out.println(a);
            
        }while(c <= num);
        JOptionPane.showMessageDialog(null, "el limite de la serie es: "+a);
        
    }
    
}
