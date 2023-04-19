/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Scanner;

/**

 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        
        // Realizar un programa que rellene un matriz de 4 x 4 
        //de valores aleatorios y muestre la traspuesta de la matriz. 
        //La matriz traspuesta de una matriz A se denota por B
        //y se obtiene cambiando sus filas por columnas (o viceversa).

        
         Scanner leer =new Scanner(System.in); 
         
         System.out.println("Ingrese tamaño matriz");
         int n = leer.nextInt();
        
         int matrizA[][]=new int[n][n];
         
         
         int matrizB [][]=new int[n][n];
        
        
        rellenarA(matrizA,n);
        intercambioB(matrizA,matrizB,n);
        mostrarmatrices(matrizA,matrizB,n);
       
    }
  
    
    
    
    public static void rellenarA(int matrizA[][], int n) {
        
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                
                matrizA[i][j]=(int)(Math.random()*10); 
                
               
            }
        }
        
    
    }
    
     public static void intercambioB (int matrizA[][],int matrizB[][], int n) {
        
        for (int i = n-1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {

                matrizB[j][i] = matrizA[i][j];

            }
        }

    }

    public static void mostrarmatrices(int matrizA[][], int matrizB[][], int n) {
        
        System.out.println("Matriz A");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(matrizA[i][j] + "");

            }
            System.out.println("");
            
        }
        System.out.println("-------------------");
        System.out.println("Matriz B");
        
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(matrizB[i][j] + "");

            }
            System.out.println("");
            
        }
        
        
    }

}
     
    
    
    
