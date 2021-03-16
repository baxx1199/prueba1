
package com.baxx.tallerprogramacion.clss;

public class Clasificacion {
    
    
    public  void clasificar(String a) {
        if (a.equalsIgnoreCase("perro") || a.equalsIgnoreCase("gato")||a.equalsIgnoreCase("humano") || a.equalsIgnoreCase("serpiente")|| a.equalsIgnoreCase("pez")){
            System.out.println(a+ " pertenece al reino animalia.");
        }else if(a.equalsIgnoreCase("rosa") || a.equalsIgnoreCase("girasol")||a.equalsIgnoreCase("roble") || a.equalsIgnoreCase("arce")|| a.equalsIgnoreCase("menta")){
            System.out.println(a+ " pertenece al reino plantae.");
        }else if(a.equalsIgnoreCase("hongo estrella") || a.equalsIgnoreCase("levadura")){
            System.out.println(a+ " pertenece al reino fungi.");
        }else if(a.equalsIgnoreCase("ameba") || a.equalsIgnoreCase("plasmodios")){
            System.out.println(a+ " pertenece al reino protista.");
        }else if(a.equalsIgnoreCase("Escherichia coli") || a.equalsIgnoreCase("Clostridium tetani")){
            System.out.println(a+ " pertenece al reino monera.");
        }
    }
}
