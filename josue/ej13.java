/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;

public class ej13 {

    public static void main(String[] args) {
        //Ejercicio 12.
        //Dado un número entero cuya cantidad de dígitos es igual a 5, determine si es
        //capicúa.
        //Nota: un número capicúa es aquel que se lee igual hacia adelante que hacia atrás
        int numero, auxiliar, inverso = 0, cifra;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Introduce un numero menor  a  10: ");
            numero = input.nextInt();
        } while (numero < 10);
        auxiliar = numero;
        while (auxiliar != 0) {
            cifra = auxiliar % 10;
            inverso = inverso * 10 + cifra;
            auxiliar = auxiliar / 10;
        }
        if (numero == inverso) {
            System.out.println("El numero ingresado es capicua");
        } else {
            System.out.println("El numero ingresado no es capicua");
        }
    }
}
