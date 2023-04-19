/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author nicolasCorpo
 */
public class EjercicioExtra4 {

    public static void comp(String numRomanos[]){
      
     Scanner sc = new Scanner(System.in);  
     System.out.println("Ingrese un numero entre 1 y 10");
     int buscar = sc.nextInt();
        if (buscar>=1 && buscar<=10){
            System.out.println("El numero Romano "+ numRomanos[buscar-1]);
        }
        else{
            System.out.println("Numero Fuera de rango");
        }
    }
    
    
    public static void main(String[] args) {
        // Elaborar un algoritmo en el cuál se ingrese un número 
        //entre 1 y 10 y se muestre su equivalente en romano.
       
        System.out.println("---Numeros Romanos---");
        
        String numR[] = {"I","II","III","IV","V","VI","VII","VIII","IX","X" };
            
        
        
        comp(numR);
        
        
        
    }

  
    
    
}
