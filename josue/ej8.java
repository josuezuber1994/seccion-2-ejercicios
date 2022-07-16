/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;


public class ej8 {
    public static void main(String[] args) {
        //Ejercicio 8.
        //Dado un (1) número, imprimir Positivo o negativo según sea el
        //numero.
        double numero=0;
        Scanner escaner = new Scanner(System.in);
        System.out.println("Escribe un número:");
         numero = escaner.nextDouble();
        if (numero < 0) {
            System.out.println("El numero ingresado es negativo");
        } else {
            System.out.println("El numero ingresado es positivo");
        }

    }
}
