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
public class EjemploGuia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Clasififique la peli de 1 al 5 estrellas");
        Scanner leer = new Scanner(System.in); // Creamos el Scanner
        int opinion = leer.nextInt();

            if (opinion >= 1  && opinion <= 5){
                switch (opinion) {
                    case 1: 
                    case 2: 
                        System.out.println("Nos sentimos apenados que no hayas disfrutado la peli...");
                        break;
                    case 3: 
                    System.out.println("Has calificado la peli como buena");
                        break;
                    case 4: 
                    System.out.println("has calificado la peli como muy buena");
                        break;
                    case 5: System.out.println("Fantastico que haya disfrutado un excelente entretenimiento!!");
                    break;
                }





            }
            else if (opinion < 0){

                System.out.println("¿Una opinion negativa? Tan mala fue");



            }
            else if (opinion == 0) {
                System.out.println("El valor " + opinion + "No es valida");

            }
            else {
                System.out.println(opinion + "Wow se fue de las mano!!");
            }



            System.out.println("hasta la proxima");


    }
    }
    

