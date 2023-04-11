/*
 * Crear un programa que dado un número determine si es par o impar.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese un numero: ");        
        Scanner leer = new Scanner(System.in); // Se utiliza para leer los datos del programa.
        int num  = leer.nextInt();
        if ( num % 2 == 0 ){
            System.out.println("Es par");
            
            
        }
        
        else {
            System.out.println("no es par");
            
        }
        
        
    }
    
}
