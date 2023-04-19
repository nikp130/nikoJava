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
public class EjercicioExtra5 {

    public static void tipo(String tipoA[], String categoria, int tratamiento) {
        boolean a;
        int i = 0;
        double descuento;
        do {

            if (categoria.equals(tipoA[i])) {
                switch (categoria) {
                    case "A":
                        descuento =  tratamiento - (tratamiento * 0.5) ;
                        System.out.println("El Tratamiento con descuento en Categoria A es " + descuento);
                        a = true;
                        break;
                    case "B":
                        descuento = tratamiento - (tratamiento * 0.35) ;
                        System.out.println("El Tratamiento con descuento en Categoria B es " + descuento);
                        a = true;
                        break;
                    case "C":
                        System.out.println("No recibe descuento en la Categoria C");
                        a = true;
                        break;

                }
                break;
            }
            else {
                i++;
            }

        } while (a = true);
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("---Descuento Obra Social por Tipo de Socio---");

        String numR[] = {"A", "B", "C"};

        Scanner sc = new Scanner(System.in);
        String cat;
        do {
            System.out.println("Ingrese la Categoria A, B o C");
            cat = sc.nextLine().toUpperCase();
        } while (!"A".equals(cat) && !"B".equals(cat) && !"C".equals(cat));

        System.out.println("Ingrese valor de tratamiento");
        int tratamiento = sc.nextInt();

        tipo(numR, cat, tratamiento);

        
    }
    
}
