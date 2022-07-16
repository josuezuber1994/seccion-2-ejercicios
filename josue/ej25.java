/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ej25 {

    
    public static void main(String[] args) {
         //Construya un programa que dado un valor entero N, haga el cálculo de la función
         //factorial utilizando estructuras iterativas.
        Scanner entrada = new Scanner(System.in);
        System.out.print("Indica el numero a calcular su factorial: ");
        int vc = 0;
        long fc = 1L;
        while (vc < 1) {
            try {
                vc = entrada.nextInt();
                if (vc < 1) {
                    System.out.println("El valor tiene que ser superior a 0");
                }
            } catch (InputMismatchException e) {
                System.out.println("El valor tiene que ser numerico...");
                entrada.nextLine();
            }
        }
        for (int i = vc; i > 0; i--) {
            fc = fc * i;
        }
        System.out.println("El factorial es " + fc);
    }

}
