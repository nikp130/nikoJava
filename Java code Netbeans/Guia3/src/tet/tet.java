/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a
otra moneda, estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de
euros y la moneda a convertir que será una cadena, este no devolverá ningún valor y mostrará un mensaje 
indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package tet;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class tet {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de euros a convertir");
        double euros = leer.nextFloat();
        System.out.println("Ingrese al tipo de moneda que desea convertirlo");
        String moneda = leer.next().toLowerCase();

        Convertir(euros,moneda);
    }
    
    public static void Convertir(double cantidad, String tipo) {
        double total = 0;
        Scanner leer = new Scanner(System.in);
        switch (tipo) {
            case "libras":
                total = cantidad * 0.86;
                break;
            case "dolares":
                total = cantidad * 1.28611;
                break;
            case "yenes":
                total = cantidad * 129.852;
                break;
        }
        System.out.println(cantidad + " euros es igual a " + total + " " + tipo); //Forma 1
        System.out.printf("%f euros es igual a %f %s",cantidad,total,tipo );       //Forma 2
    }
}