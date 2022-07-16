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
        //El IMC resulta de la división de la masa del individuo (en kilogramos) entre el
        //cuadrado de la estatura (en metros). El índice de masa corporal es un indicador
        //del peso de una persona en relación con su altura.
        //Clasificación del IMC de acuerdo con la OMS de la ONU:
        //a. Menor a 16: Criterio de ingreso.
        //b. 16 a 16.9: infra peso.
        //c. 17 a 18.4: bajo peso.
        //d. 18.5 a 24.9: peso normal.
        //e. 25 a 29.9: sobrepeso.
        //f. 30 a 34.9: obesidad pre-mórbida.
        //g. 40 a 45: obesidad mórbida.
        //h. Mayor a 45: obesidad híper-mórbida.
        //Dado el peso de una persona en libras (1 libra = 0,453592 Kg) y su estatura en
        //centímetros, calcule su IMC e indique como salida el peso en kilogramos, el valor
        //de IMC de la persona y la categoría en la cual fue clasificado.
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
