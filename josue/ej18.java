/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;

public class ej18 {
public static void main(String[] args) {
        //ejercicio 18
        //El IMC resulta de la división de la masa del individuo (en kilogramos) entre el
        //cuadrado de la estatura (en metros). El índice de masa corporal es un indicador
        //del peso de una persona en relación con su altura.
       // Clasificación del IMC de acuerdo con la OMS de la ONU:
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
