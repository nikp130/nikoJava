/*
 * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a 
cada una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C 
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores 
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class EjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("");
        
        int A=1;
        int B=2;
        int C=3;
        int D=4;
        System.out.printf("%d es A %d es B, %d C y %d D",A,B,C,D);
        
        
        auxiliar(A,B,C,D);
        
        
    }
    public static void auxiliar(int A,int B, int C, int D){
     
        int aux;
        
        aux=B;
        B = C;
        C = A;
        A = D;
        D = aux;
        System.out.println("");
        System.out.printf("el nuevo ordes es %d es A %d es B, %d C y %d D ",A,B,C,D);
        
    }
}
