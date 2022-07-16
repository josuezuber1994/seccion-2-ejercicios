/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;


public class ej3 {
     public static void main(String[] args) {
         Scanner input = new Scanner (System.in);    
         int resultado1 = 0;
        int resultado2 = 0;
        int a = 785;
        int b = 555;
        int c = 10;
        resultado1 = (a + (b / c)) / ((a / b) + c);
        resultado2 = (a / (a + b)) / (a / (a - b));

         System.out.println( "El resultado de la primera operacion es: " + resultado1);
         System.out.println("El resultado de la seguda operacion es: " + resultado2);
    }
}

     