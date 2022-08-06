
package com.mycompany.hola;


public class OperadoresCondicionales {
    
 public static void main(String[] args) {

    int a = 15;
    int valorMinimo = 0, valorMaximo = 10;
    
    boolean resultado = a>= valorMinimo && a<= valorMaximo;
        System.out.println("resultado = " + resultado);
        
        boolean vacaciones = false;
        boolean diaDescanso = false;
        if(vacaciones || diaDescanso){
            System.out.println("padre puede asistir al juego del hijo");
            
        }else{
            System.out.println("padre ocupado");
        }
    
        
        
    }
    
}