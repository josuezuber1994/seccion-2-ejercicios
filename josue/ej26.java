/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;

public class ej26 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Ejercicio
        //Dado un número entero N que representa una contraseña y asumiendo que una
        //contraseña debe tener al menos 10 dígitos para ser segura, determine si la
        //contraseña ingresada por el usuario es correcta, de no serlo debe pedirla
        //nuevamente hasta que tenga los 10 (diez) dígitos solicitados y al ser correcta
        //mostrar un mensaje de éxito al usuario, por salida estándar.
        int numero = 0;
        String palabra = "";
        System.out.println("ingrese la contraseña");
        palabra = input.nextLine();
        numero = palabra.length();
        while (numero != 10) {
            System.out.println("ingrese la contraseña");
            palabra = input.nextLine();
            numero = palabra.length();
        }
        System.out.println("Acceso exitoso");
    }
}
