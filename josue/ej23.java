/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;

public class ej23 {
     public static void main(String[] args) {
          //Ejercicio 23
         //Dado un número, determine si es capicúa.
        //Nota: un número capicúa es aquel que se lee igual hacia adelante que hacia atrás 
        int numero,ax, digito, iv;
        Scanner input=new Scanner (System.in);
        System.out.println("Ingrese un numero: ");
        numero = input.nextInt();
        iv = 0;
        ax = numero;
        while (ax > 0) {
            digito = ax % 10;
            iv = iv * 10 + digito;
            ax = ax / 10;
        }
        if (numero == iv) {
           System.out.println("El numero es capicua");
        } else {
           System.out.println("El numero no es capicua");
        }
    }
}

