/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;

public class ej9 {

    public static boolean findParity(int numero) {
        //Ejercicio 9.
       //Dado un (1) número binario de cuatro (4) dígitos imprimir su bit da paridad. El bit
       //de paridad es 1 si el número de bits 1 es impar y 0 en caso contrario.

        numero = (numero & 0x0000FFFF) ^ (numero >> 16);
        numero = (numero & 0x000000FF) ^ (numero>> 8);
        numero = (numero & 0x0000000F) ^ (numero >> 4);
        numero = (numero & 0x00000003) ^ (numero >> 2);
        numero = (numero & 0x00000001) ^ (numero >> 1);

        return (numero & 1) == 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int numero =0;
        System.out.println("Ingrese un numero: ");
        numero= input.nextInt();

        System.out.println(numero + " el numero en binario es " + Integer.toBinaryString(numero));

        if (findParity(numero)) {
            System.out.println(numero + "El numero contiene bits es impar");
        } else {
            System.out.println(numero + "El numero contiene bits es para");
        }
    }
}


