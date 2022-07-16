/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;

public class ej21 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        //Ejercicio 21 
        //En un almacén se hace un 20% de descuento a los clientes cuya compra supere
        //los Bs 1000, se desea que realice un algoritmo el cual tome por entrada el monto a
        //pagar por el cliente y arroje como salida el monto aplicando el descuento de ser
        //necesario
        double mc, dc = 0.020, tp;
        System.out.print("Ingrese el monto de su compra : ");
        mc = input.nextDouble();
        input.nextLine();
        dc = mc * 0.020;
        tp= mc-dc;      
        if (mc <= 999) {
            System.out.println("Sin descuento");
            System.out.println("El total a pagar: "+mc);
        } else if (mc >= 1000) {
            System.out.println("Su descuento del 20% es de: "+dc);
             System.out.println("Su total a pagar: "+tp);
        }
    }
}
