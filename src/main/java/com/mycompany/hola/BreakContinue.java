package com.mycompany.hola;

public class BreakContinue {

    public static void main(String[] args) {

//        for (var i = 0; i < 3; i++) {
//            //imprimimos solo numeros pares
//            if(i % 2 == 0){
//                System.out.println("i = " + i);
//                break;
//        }
        inicio:
        for (var i = 0; i < 3; i++) {
            //imprimimos solo numeros pares
            if (i % 2 != 0) {
                break inicio;
            }
            System.out.println("i = " + i);

        }
    }
}
