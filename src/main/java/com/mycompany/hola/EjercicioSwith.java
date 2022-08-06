
package com.mycompany.hola;

import java.util.Scanner;


public class EjercicioSwith {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("proporcionar valor del mes");
        var mes = scanner.nextInt();
        String estacion = null;
        switch (mes){
            
            case 1: case 2: case 12:
                estacion = "invierno";
                break;
                
            case 3: case 4: case 5:
                estacion = "primavera";
                break;
                
            case 6: case 7: case 8:
                estacion = "verano";
                break;
                       
            case 9: case 10: case 11:
                estacion = "otoño";
                break;
                
            default:
        }
        System.out.println("estacion = " + estacion + "para el mes: " + mes);
        
    }
}
