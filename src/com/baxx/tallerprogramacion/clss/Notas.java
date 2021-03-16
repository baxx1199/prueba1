
package com.baxx.tallerprogramacion.clss;

import javax.swing.JOptionPane;


public class Notas {
    
    
    public void tocar(int a){
        
        switch(a){
            
                        
                    case 1:
                        
                        JOptionPane.showMessageDialog(null, "Tocaste un DO." );
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Tocaste un RE." );
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Tocaste un MI." );
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Tocaste un FA." );
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Tocaste un SOL." );
                        break; 
                    case 6:
                        JOptionPane.showMessageDialog(null, "Tocaste un LA." );
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Tocaste un SI." );
                        break;
                    default :
                        JOptionPane.showMessageDialog(null, "Ingresa una opcion valida.", "error",JOptionPane.WARNING_MESSAGE );
                        break;
        }
    }
}
