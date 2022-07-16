/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;

public class ej12 {
    
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, anio;
         System.out.println("Ingresa un dia:");
          dia = sc.nextInt();
          System.out.println("Ingresa un mes: ");
           mes = sc.nextInt();
        System.out.println("Ingresa un año: ");
        anio = sc.nextInt();
        if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) {
            System.out.println("El año " + anio + " si es bisiesto ");
        } else {
            System.out.println("El año " + anio + " no es bisiesto ");
        }
    }
}