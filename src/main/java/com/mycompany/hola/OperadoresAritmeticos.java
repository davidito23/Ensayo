
package com.mycompany.hola;


public class OperadoresAritmeticos {
    
  public static void main(String[] args) {

        int a = 3, b = 2;
        
        int resultado = a + b;
        System.out.println("resultado suma = "+ resultado);
        
        System.out.println("resultado suma = " + (a + b));
            
        resultado = a - b;
        System.out.println("resultado resta = " + resultado);
        System.out.println("resultado resta = " + (a - b));
        
        resultado = a * b;
        System.out.println("resultado multiplicacion = " + resultado);
        System.out.println("resultado multiplicacion = " + (a * b));
        
        var resultado2 = 3F / b;
        System.out.println("resultado divicion = " + resultado2);
        System.out.println("resultado divicion = " + (3F / b));
        
        
        resultado = a % b;
        System.out.println("resultado modulo =" + resultado);
        
        resultado = 123 % 2;
        System.out.println("resultado = " + resultado);
        
        if(resultado == 0){
            System.out.println("es numero par");
        }else{
            System.out.println("es impar");
        }
    }
    
}