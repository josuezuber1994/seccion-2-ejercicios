/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;

public class ej18 {
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double kg, lb, et, mt, imc;
        String cl= "";
        System.out.print("Ingrese su peso en libras: ");
        lb = in.nextDouble();
        in.nextLine();
        System.out.print("Ingrese Su estatura en centimetros: ");
        et = in.nextInt();
        in.nextLine();
        mt = et * 0.01;
        kg = lb * 0.453;
        System.out.println("Valor en KG es: " + kg);
        imc = kg/ Math.pow(mt, 2);
        if (imc < 16) {
            cl = "Criterio de ingreso";
        } else if (imc >= 16 && imc <= 16.9) {
            cl= "Infrapeso";
        } else if (imc >= 17 && imc <= 18.4) {
            cl = "Bajo Peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            cl = "Peso normal";
        } else if (imc >= 25 && imc <= 29.9) {
            cl = "Sobrepeso";
        } else if (imc >= 30 && imc <= 34.9) {
            cl = "Obesidad pre-mórbida";
        } else if (imc >= 45) {
            cl = "obesidad híper-mórbida.";
        }
        System.out.println("Su idice de masa corporal es (IMC): " + imc);
        System.out.println("Segun el (IMC): " + cl);
    }
}    
