/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;

public class ej19 {
    public static void main(String[] args) {
        //Escriba un algoritmo que reciba una fecha (día y mes) correspondiente al año
       //2014 e imprima por pantalla el número de días que han pasado desde el 1 de
       //Enero de 2014 hasta la fecha dada.
        LocalDate date = LocalDate.of(2014,1,1);
        int mes = date.getMonthValue(), dia = date.getDayOfMonth();
        int mesIn, diaIn;
        mesIn = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el mes:"));
        diaIn = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dia:"));  
        LocalDate dateIn = LocalDate.of(2014, mesIn, diaIn);
        Period periodo = Period.between(date, dateIn);
        int dias = periodo.getDays();
        int meses = periodo.getMonths();
        
        System.out.println(date);
        System.out.println(dateIn);
        System.out.println("Han pasado: "+meses+", meses y "+dias+" dias");
    }    
}
