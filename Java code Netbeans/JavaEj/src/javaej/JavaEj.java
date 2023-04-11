/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaej;

import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class JavaEj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
             Scanner leer = new Scanner(System.in);   // Trae Funcion leer
             
             System.out.println("Ingrese Primer numero");  // Imprime en Pantalla
             int num = leer.nextInt();                     //
               System.out.println("Ingrese Segundo numero");
             int num2 = leer.nextInt();
             
             System.out.println("La suma es " + (num+num2) );
             
             
             
             
             
    }
    
}
