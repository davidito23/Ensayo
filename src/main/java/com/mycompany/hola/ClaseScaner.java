
package com.mycompany.hola;

import java.util.Scanner;


public class ClaseScaner {
    
  public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Proporciona el valor del usuario:");
        var usuario = scanner.nextLine();
        System.out.println("usuario = " + usuario);

    }
}
