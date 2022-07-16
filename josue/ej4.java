/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

public class ej4 {
     public static void main(String[] args) {
        
        int numero1 = 45,numero2 = 7, suma = 0, resta = 0,
                multiplicacion = 0, division = 0, residuo = 0;
       
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = numero1 / numero2;
        residuo = numero1 % numero2;
      
        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("El resultado de la resta es: "+resta);
        System.out.println("El resultado de la multiplicacion es: "+multiplicacion);
        System.out.println("El resultado de la division es: "+division);
         System.out.println("El resultado del modulo es: "+residuo);
    }
}
