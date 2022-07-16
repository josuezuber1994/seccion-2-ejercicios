/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;

public class ej10 {

    public static void main(String[] args) {
        long n, ax, di, en;
        int exp;
        boolean binario;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Ingrese el numero binario: ");
            n = input.nextLong();
            binario = true;
            ax = n;
            while (ax != 0) {
                di = ax % 10;
                if (di != 0 && di != 1) {
                    binario = false;
                }
                ax = ax / 10;
            }
        } while (!binario);
        exp = 0;
        en = 0;
        while (n != 0) {
            di = n % 10;
            en = en + di * (int) Math.pow(2, exp);
            exp++;
            n = n / 10;
        }
        System.out.println("EEl numero entero convertido de binario es : " + en);
    }
}
