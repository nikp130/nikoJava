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
public class EjercicioExtra3 {

    public static void Vocal(String buscarvocal){
        boolean caracter;
        
        if (caracter= buscarvocal.equals("a")){
            System.out.println("Es una Vocal");  
        }
        else {
            System.out.println("No es una vocal");
        }
        
        
      
    }
    
    public static void main(String[] args) {
        // Elaborar un algoritmo en el cuál se ingrese una letra y se 
        //detecte si se trata de una vocal. Caso contrario mostrar un 
        //mensaje. Nota: investigar la función equals() de la clase String.
        System.out.println("---Vocal o no Vocal---");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una Letra");
        
        
        String letra = sc.next().toLowerCase();
        
       Vocal(letra);
        
    }
    
    
   
    
    
}
