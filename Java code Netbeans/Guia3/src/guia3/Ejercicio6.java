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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int opcion ;
        int numero1, numero2;
        System.out.println("Ingrese dos números enteros positivos:");
        numero1 = sc.nextInt();
        numero2 = sc.nextInt();

        do {

            System.out.println("MENU DE OPERACIONES");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("La suma es: " + (numero1 + numero2));
                    break;
                case 2:
                    System.out.println("La resta es: " + (numero1 - numero2));
                    break;
                case 3:
                    System.out.println("La multiplicación es: " + (numero1 * numero2));
                    break;
                case 4:
                    if (numero2 == 0) {
                        System.out.println("No se puede dividir por cero");
                    } else {
                        System.out.println("La división es: " + ((double) numero1 / numero2));
                    }
                    break;
                case 5:
                    System.out.print("¿Está seguro que desea salir del programa (S/N)? ");
                    char respuesta = sc.next().charAt(0);
                    if (respuesta == 'S' || respuesta == 's') {
                        System.out.println("¡Hasta pronto!");
                        return;
                    } else {
                        opcion = 0;
                    }
                    break;
                default:
                    System.out.println("Opción inválida. Por favor ingrese una opción válida.");
            }
        } while (opcion != 5);
    }


        
        
        
        
        
    }
    
}
