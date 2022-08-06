/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hola;

import java.util.Scanner;

/**
 *
 * @author PROGRAMACION
 */
public class ConversionTiposPrimitivos {
    
    public static void main(String[] args) {
 //Convertir un String a un tipo int
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + edad);

        double valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);

        char c = "hola".charAt(3);
        System.out.println("c = " + c);

        var scanner = new Scanner(System.in);
        edad = Integer.parseInt(scanner.nextLine());
        System.out.println("edad = " + edad);
        
        char caracter = scanner.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
        
        String edadTexto = String.valueOf(false);
        System.out.println("edadTexto = " + edadTexto);
        
        //Conversion de tipos
        short s = 10;
        byte b = (byte) s;
        
        System.out.println("b = " + b);
    }
}
