/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;

public class ej15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s, m, h;
        System.out.print("Ingrese una cantidad para convertir en segundos : ");
        s = Integer.parseInt(input.next());
        h = s / 3600;
        m = s / 60;
        System.out.println("EN HORAS : " + h);
        System.out.println("EN MINUTOS : " + m);
    }
}