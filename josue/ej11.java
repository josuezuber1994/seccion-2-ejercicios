/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;

public class ej11 {

    public static void main(String[] args) {
        int n = 0;
        Scanner escaner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        n = escaner.nextInt();
        int millar = n / 1000;
        int centena = (n - (millar * 1000)) / 100;
        int decena = (n - (millar * 1000 + centena * 100)) / 10;
        int unidad = n - (millar * 1000 + centena * 100 + decena * 10);
        System.out.println("Los Millares son = " + millar);
        System.out.println("Las Centenas son = " + centena);
        System.out.println("Las Decenas son = " + decena);
        System.out.println("Las Unidades son = " + unidad);
    }
}
