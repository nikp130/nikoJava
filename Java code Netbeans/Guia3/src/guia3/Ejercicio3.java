/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba una frase de 8 caracteres");
        String frase = leer.nextLine();
        //Lenght()
        if (frase.length() > 8) System.out.println("Incorrecto");
        else System.out.println("Correcto");
        
   
  
    }
    
}
