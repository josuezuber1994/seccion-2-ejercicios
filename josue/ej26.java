/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;

public class ej26 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
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
