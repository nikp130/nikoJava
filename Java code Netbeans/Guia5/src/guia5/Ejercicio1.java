/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author nicolasCorpo
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realizar un algoritmo que llene un vector con los 100 
        //primeros números enteros y los muestre por pantalla en orden descendente.
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Numeros Aleatorios");
        
       
        
        int vector[] = new int[101];
        
        	for (int i = 1; i < 101; i++) {
    	 
        	vector[i] = i;
                
    	}
        	for (int i = 101 - 1; i > 0; i--) {
    	 
        	vector[i] = i;
                 System.out.println("[" + vector[i] + "]");
    	}
     
        
  
        
        
    }
    
}
