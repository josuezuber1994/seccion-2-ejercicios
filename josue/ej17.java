/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;

public class ej17 {
     static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int hora;
        System.out.print("Ingrese la cantidad de horas: ");
        hora = input.nextInt();
        System.out.println("El recio es: " + cPrecio(hora));
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