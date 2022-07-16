/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;


public class ej5 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //Ejercicio 5.
        //Dados tres (3) números, Hacer una aplicación que calcule la resolvente.
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        double resultado = 0.0;
        
        System.out.println("Ingresa la variable de A:");
        a= input.nextDouble();
        System.out.println("Ingresa la variable de B:");
        b=input.nextDouble();
        System.out.println("Ingresa la variable de C:");
        c = input.nextDouble();
        resultado = (-b +(Math.sqrt(Math.pow(b, 2) + (4*a*c))))/(2*a);
        
        System.out.println("El resulto de los ingresos es: "+ resultado);
    }
}
    

    

