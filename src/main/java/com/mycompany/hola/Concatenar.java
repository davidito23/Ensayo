
package com.mycompany.hola;


public class Concatenar {
    
    
 public static void main(String[] args) {
       
      var Usuario = "Juan";
      var Saludar = "Hola";
      
        System.out.println(Saludar + " " +  Usuario);
        
        var i = 3;
        var j = 5;
        System.out.println(i + j);
        
        System.out.println(Saludar + i + j); //Primero encuentra cadena, por lo tanto lo restante lo concatena.
        System.out.println(i + j + Saludar); //Primero encuentra numeros, por lo tanto primero suma y despues concatena.
        
    }
}
