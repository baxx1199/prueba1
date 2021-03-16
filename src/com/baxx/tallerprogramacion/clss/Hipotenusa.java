
package com.baxx.tallerprogramacion.clss;

import javax.swing.JOptionPane;

public class Hipotenusa {
    public void hallar(double c1, double c2){
        double h;
        
        h = Math.sqrt((c1*c1)+ (c2*c2));
        
        JOptionPane.showMessageDialog(null, "La hipotenusa es: "+ h);
    }
}
