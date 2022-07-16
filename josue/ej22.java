/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.io.IOException;
import java.util.Scanner;


public class ej22 {
 public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n, c;
        char car;
        do {
            System.out.print("Introduce un numero: ");
            n = sc.nextInt();
            c = 0;   
            while (n != 0) {             
                n = n / 10;        
                c++;          
            }
            System.out.println("El número tiene " + c );
            System.out.print("¿Desea continuar? ");
            car = (char) System.in.read();
        } while (car != 'n' && car != 'N');
    }
}    
