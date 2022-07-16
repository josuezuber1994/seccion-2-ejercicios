/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;

public class ej28 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
          //ejercicio
        //Se tiene una secuencia de enteros terminada en cero, que corresponde a la edad,
        //peso y estatura de una muestra de hombres y mujeres mayores de 18 años. Con
        // base en dicha secuencia se desea realizar un estudio a fin de conocer:
        //Edad promedio de todas las personas en la muestra.
        //Peso promedio de todas las personas en la muestra.
        //Estatura promedio de todas las personas en la muestra.
       //Cuántas personas hay con edad entre los 18 y 25 años.
      //Cuántas personas son mayores a 36 años.

        int cEdad = 0, cEdad2 = 0;
        double edad = 0, peso = 0, estatura = 0, pEdad = 0, pEstatura = 0, pPeso = 0, pPesoEdad = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Persona: " + i);
            System.out.println("Ingresa la edad: ");
            edad = input.nextDouble();
            System.out.println("Ingresa el peso: ");
            peso = input.nextDouble();
            System.out.println("Ingresa la estatura: ");
            estatura = input.nextDouble();
            pEdad += edad;
            pPeso += peso;
            pEstatura += estatura;
            if (edad >= 18 && edad <= 25) {
                cEdad++;
                pPesoEdad += peso;
            } else if (edad > 36) {
                cEdad2++;
            }
        }
        pEdad = pEdad / 10;
        pEstatura = pEstatura / 10;
        peso = pPeso / 10;
        pPesoEdad = pPesoEdad / cEdad;
        System.out.println("Promedio de las edades: " + pEdad);
        System.out.println("Promedio de las estaturas: " + pEstatura);
        System.out.println("Promedio de los pesos: " + pPeso);
        System.out.println("Personas entre 18 y 25 anios: " + cEdad);
        System.out.println("Personas mayores de 36: " + cEdad);
        System.out.println("Promedio del peso de personas entre 18 y 25 anios: " + pPesoEdad);

    }
}


