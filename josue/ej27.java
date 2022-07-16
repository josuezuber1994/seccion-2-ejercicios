/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;


public class ej27 {
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Dada una secuencia de números terminada en cero (0), elaborar un algoritmo que
        //informe al usuario qué valor tiene el número mayor y qué valor tiene el número
        //menor, sin contar el cero (0).
        String n="105";
        String n2="4253252";
        String nc="";
        String nc2="";
        int nci=0,nci2=0;
        for(int i=0; i<n.length() ;i++){
            if(n.charAt(i)!='0'){
            nc=nc+n.charAt(i);
            
        }            
        }
        for(int i=0; i<n2.length() ;i++){
            if(n2.charAt(i)!='0'){
            nc2=nc2+n2.charAt(i);           
        }            
        }
       
         nci= Integer.parseInt(nc);
        nci2= Integer.parseInt(nc2);
           if (nci>nci2 ){
               System.out.println("EL numero mayor es: "+nci);    
               System.out.println("EL numero menor es: "+nci2);               
           }else {
               System.out.println("EL numero mayor es: "+nci2);
               System.out.println("EL numero menor es: "+nci);
           }          
    }
}  
