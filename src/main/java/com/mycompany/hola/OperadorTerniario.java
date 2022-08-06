
package com.mycompany.hola;


public class OperadorTerniario {
public static void main(String[] args) {

        var resultado = (3 > 2) ? "Verdadero" : false;

        System.out.println("resultado = " + resultado);
        
        var numero = 8;
        var par = (numero % 2 == 0) ? "numero par" : "numero impar";
        System.out.println("par = " + par);
    }
}
