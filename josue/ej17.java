/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;

public class ej17 {
     static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        //ejercicio 17 
        //En un estacionamiento el monto a pagar se calcula multiplicando el número de
       //horas que permaneció el automóvil dentro del estacionamiento por Bs. 4 y se
       //incrementa esta cantidad en Bs. 2,50 por cada media hora adicional.
       //Ahora se desea que usted elabore un algoritmo que a partir de la hora de entrada
       //y la hora de salida de un vehículo (las mismas corresponden a un mismo día)
     //calcule el monto a pagar por el dueño del vehículo.
     //La entrada vendrá dada por dos enteros positivos el primero representa las horas
    //y el segundo los minutos, además por último se debe leer un carácter (A o P) que
     //indica si la hora es AM o PM
        int hora;
        System.out.print("Ingrese la cantidad de horas: ");
        hora = input.nextInt();
        System.out.println("El precio es: " + cPrecio(hora));
    }
    public static double cPrecio(int hora) {
        double precio = 0;
        if (hora <= 3) {
            precio = hora * 20;
        } else if (hora > 3 && hora <= 24) {
            precio = (3 * 20) + ((hora - 3) * 15);
            if (hora == 24) {
                precio = 250;
            }
        } else if (hora > 24) {
            precio = ((int) (hora / 24)) * 250 + (hora % 24 * 15);
        }
        return precio;
    }
}
