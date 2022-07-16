/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;


public class ej7 {
    public static void main(String[] args) {
        //Ejercicio 7.
        //Dado un (1) número, imprimir 0 si es par y 1 si es impar
        int numero;
        Scanner teclado = new Scanner(System.in);

        System.out.printf("Introduzca un numero : ");
        numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.printf("El numero ingresado es par");
        } else {
            System.out.printf("El numero ingresado es impar");
        }
    }
}
    

