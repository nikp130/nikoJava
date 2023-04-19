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
public class EjercicioExtra6 {

    public static double promedio(int n ){
        int i= 1;
        Scanner sc = new Scanner(System.in);
        double acum = 0;
        while (i < n+1){
            System.out.printf("Ingrese la estatura en cm de la %d ", i);
            
            double est = sc.nextDouble();
            i++;
            acum = acum + est;
            
        }
        double prom = acum / n;
        
        return prom;
        
    }
    
    
    public static void main(String[] args) {
        // Leer la altura de N personas y determinar el 
        //promedio de estaturas que se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
          Scanner sc = new Scanner(System.in);
          System.out.println("Ingrese la cantidad de personas a promediar");
          
          int n = sc.nextInt();
         System.out.println("El Promedio de estatura es " +  promedio(n)); 
       
        
    }
    
}
