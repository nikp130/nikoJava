/*
 //* Escriba un programa en el 
/*cual se ingrese un valor límite positivo, y a continuación 
//*solicite números al usuario hasta que la suma de los 
//*números introducidos supere el límite inicial.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el valor límite positivo: ");
        int limite = sc.nextInt();
        
        int suma = 0;
        int contador = 0;
        
 
        while(suma <= limite) {
            System.out.print("Ingrese un número: ");
             suma+= sc.nextInt();
            
            contador++;
        }
        
        System.out.println("Se han ingresado " + contador + " números para superar el límite.");
        
        
        
        
        
        
    }
    
}
