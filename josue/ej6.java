/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;


public class ej6 {
    public static void main(String[] args) {
        //Ejercicio 6.
       //Dados dos (2) lados de un triángulo en cm, calcular la hipotenusa del mismo.
        double a=0;
        double b=0;
        double resultado=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el valor del cateto A: ");
         a = input.nextDouble();
        System.out.print("Ingese el valor del cateto B: ");
         b = input.nextDouble();

        a = Math.pow(a, 2);
        b = Math.pow(b, 2);

        resultado = Math.sqrt(a + b);

        System.out.println("Valor de Hipotenusa es: " + resultado);
    }
}


