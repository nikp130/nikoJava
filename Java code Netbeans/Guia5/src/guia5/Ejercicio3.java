/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

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
        // Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
        
        Scanner sc = new Scanner(System.in);
        
         System.out.println("Ingrese el tamaño de vector");
           int n = sc.nextInt();
           int contador = 0;
          int vector[] = new int[n];
        
        	for (int i = 0; i < n; i++) {
    	 
        	vector [i] = (int) (Math.random() * 100000);
                    System.out.println(vector[i]);
                    int num = vector [i] ;
                    
                while (vector[i] != 0){
                    
                    int digit = num % 10;
                    contador++;
                    num /= 10;
                }    
                    
                     System.out.println("La cantidad de digitos es" + contador);  
       
                    
    	}
        
        
        
        
        
        
    }
    
}
