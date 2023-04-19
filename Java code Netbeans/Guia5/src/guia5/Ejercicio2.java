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
public class Ejercicio2 {

    public static void buscarN(int buscar, int vector[], int n) {

        for (int i = 0; i < n; i++) {
            if ((buscar== vector[i])) {
                
                System.out.println("Se encontro el numero en la posicion "+ i );
                
            }
            else{
                System.out.println("No se encontro en la posicion " + i);
               
            }  

        }

        
        
        
        
    }
    public static void main(String[] args) {
        // Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios 
        //y le pida al usuario un número a buscar en el vector. 
        //El programa mostrará dónde se encuentra el numero y si se encuentra repetido
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño de vector");
           int n = sc.nextInt();
        
          int vector[] = new int[n];
        
        	for (int i = 0; i < n; i++) {
    	 
        	vector [i] = (int) (Math.random() * 10);
                    System.out.println(vector[i]);
    	}
        
        System.out.println("Ingrese el numero a buscar");
            int buscar = sc.nextInt();
            
            buscarN(buscar,vector,n);
        
    }
    
}
