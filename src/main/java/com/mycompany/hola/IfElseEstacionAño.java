
package com.mycompany.hola;

import java.util.Scanner;

public class IfElseEstacionAño {
     public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);
        System.out.println("ingrese mes del año");
       var mes = scanner.nextInt();//mes del año
       
       String estacion = null;
       
       if(mes == 1 || mes == 2 || mes == 3 || mes == 12){
           estacion = "invierno";
           
       }
       else if (mes == 3 || mes == 4 || mes == 5){
           estacion = "primavera";
       }
       else if (mes == 6 || mes == 7 || mes == 8){
            estacion = "verano";
          
       }
       else if (mes == 9 || mes == 10 || mes == 11){
           estacion = "otoño";
       }
       else{
           
       }
        System.out.println("estacion: " + estacion + " para el mes: " + mes);
    }
}

