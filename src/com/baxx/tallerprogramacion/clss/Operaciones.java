
package com.baxx.tallerprogramacion.clss;


public class Operaciones {
    public int suma;
    public int resta;
    public int residuo;
    
    public void calcular(int a, int b){
        System.out.println("numeros ingresados: "+a +" , "+b);
        suma = a + b;
        resta = a - b;
        residuo = a % b;
        System.out.println("La suma de los numeros "+a+" , "+b +" es igual a: "+ suma +
                "\n La resta de los numeros "+a+" , "+b +" es igual a: "+ resta +
                "\n El residuo obtenido de la division de los numeros "+a+" , "+b +" es igual a: "+ residuo 
        
        );
    }
}
