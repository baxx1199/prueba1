
package com.baxx.tallerprogramacion.clss;

import javax.swing.JOptionPane;


public class Contraseña {
    
    
    public void confirmar(){
        final int claveUno = 1234;
        int claveDos;
        String ing;
        
        
        for(int i =1;i <=3;i++ ){            
            ing = JOptionPane.showInputDialog(null,"ingrese su contraseña (debe tener 4 digitos)" );
            System.out.println(ing.length());
            boolean valido=verificar(ing);
            System.out.println(valido);
            if (valido ==true){
                claveDos = Integer.parseInt(ing);
                System.out.println(claveDos);
                
                if(claveDos == claveUno){
                    JOptionPane.showMessageDialog(null, "Acceso permitido");
                }else{
                    JOptionPane.showMessageDialog(null, "Acceso denegado","error",JOptionPane.ERROR_MESSAGE);
                }
  
            }
            if (i==3) {
                    JOptionPane.showMessageDialog(null, "Clave bloqueda","advertencia",JOptionPane.WARNING_MESSAGE);
                }
   
        } 
       
     
    
    }  
    public boolean verificar(String a){
        boolean valido=false;
        if(a.length()==4){
            valido = true;
        }else{
            JOptionPane.showMessageDialog(null, "contraseña invalida, la contraseña debe ser numerica de cuatro digitos ");
        }
        
        
        return valido;
    }
    
}
