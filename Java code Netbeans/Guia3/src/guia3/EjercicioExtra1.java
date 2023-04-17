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
public class EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un tiempo en minutos: ");
        int minutos = scanner.nextInt();

        int horas = minutos / 60; // Calculamos las horas
        int dias = horas / 24; // Calculamos los días
        horas %= 24; // Obtenemos el resto de horas

        System.out.printf("%d minutos equivalen a %d días y %d horas.\n", minutos, dias, horas);
       
        
        
        
        
        
        
    }
    
}
