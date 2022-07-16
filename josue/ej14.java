/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;


public class ej14 {
        public static void main(String[] args) {
        ////Ejercicio 14 
        //Cree un algoritmo que tome por entrada las horas y minutos de un día y dé como
        //resultado su equivalente en segundos.
        int segundo = 0;
        int minuto = 0;
        int hora = 0;
        int horasSegundos = 0;
        int minutosSegundos = 0;
        Scanner input = new Scanner (System.in);
        System.out.println("Ingrese las horas:");
        hora =input.nextInt();
        System.out.println("Ingrese los minutos:");
        minuto = input.nextInt();
        horasSegundos = hora * 3600;
        minutosSegundos = minuto * 60;
        segundo = horasSegundos + minutosSegundos;
        System.out.println("La conversion en segundos es :" + segundo);
    }
}

