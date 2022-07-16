/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;

public class ej16 {

    public static void main(String[] args) {
         //ejercicio 16
        //En un estacionamiento el monto a pagar se calcula multiplicando el número de
        //horas que permaneció el automóvil dentro del estacionamiento por Bs. 4 y se
        //incrementa esta cantidad en Bs. 2,50 por cada media hora adicional.
        //Ahora se desea que usted elabore un algoritmo que a partir de la hora de entrada
        //y la hora de salida de un vehículo (las mismas corresponden a un mismo día)
        //calcule el monto a pagar por el dueño del vehículo.
        //La entrada vendrá dada por dos enteros positivos el primero representa las horas
        //y el segundo los minutos, además por último se debe leer un carácter (A o P) que
        //indica si la hora es AM o PM.
        double x = 0.0, a = 0.0, b = 0.0, c = 0.0;
        int numero1 = 0, numero2 = 0, numero3 = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa la variable de A:");
        a = input.nextDouble();
        System.out.println("Ingresa la variable de B:");
        b = input.nextDouble();
        System.out.println("Ingresa la variable de C:");
        c = input.nextDouble();
        x = (-b + (Math.sqrt(Math.pow(b, 2) + (4 * a * c)))) / (2 * a);
        System.out.println(x);
        System.out.println("Ingrese el primer numero:");
        numero1 = input.nextInt();
        System.out.println("Ingrese el segundo numero:");
        numero2 = input.nextInt();
        System.out.println("Ingrese el tercer numero:");
        numero3 = input.nextInt();
        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("El primer numero: " + numero1 + " es el mayor");
            if (numero2 > numero3) {
                System.out.println("El segundo numero: " + numero2 + " es el segundo mayor");
                System.out.println("El tercer numero: " + numero3 + " es el menor");
            } else {
                System.out.println("El tercer numero: " + numero3 + " es el segundo mayor");
                System.out.println("El segundo numero: " + numero2 + " es el menor");
            }
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("El segundo numero: " + numero1 + " es el mayor");
            if (numero1 > numero3) {
                System.out.println("El primer numero: " + numero1 + " es el segundo mayor");
                System.out.println("El tercer numero: " + numero3 + " es el menor");
            } else {
                System.out.println("El tercer numero: " + numero3 + " es el segundo mayor");
                System.out.println("El primer numero: " + numero1 + " es el menor");
            }
        } else if (numero3 > numero1 && numero3 > numero2) {
            System.out.println("El tercer numero: " + numero3 + " es el mayor");
            if (numero1 > numero2) {
                System.out.println("El primer numero: " + numero1 + " es el segundo mayor");
                System.out.println("El segundo numero: " + numero2 + " es el menor");
            } else {
                System.out.println("El segundo numero: " + numero2 + " es el segundo mayor");
                System.out.println("El primer numero: " + numero1 + " es el menor");
            }
        }
    }
}
