/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;

public class ej29 {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        //ejercicio
        //Construye un algoritmo que calcule e imprima la tabla de multiplicar, desde la tabla
       // del 1 hasta la del 10.
        int numero = 0;
        for (int indice = 1; indice<= 10; indice++) {
            for (int j = 1; j <= 10; j++) {
                numero = indice * j;
                System.out.println(indice+ "*" + j + "=" + numero);
            }
        }
    }
}

