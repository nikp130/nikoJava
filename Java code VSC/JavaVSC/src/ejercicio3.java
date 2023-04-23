
import java.util.Scanner; // Este es el importe de la clase Scanner

public class ejercicio3 {
    public static void main(String[] args) throws Exception {

        int[] vector = { 123, 4567, 89012 };

        for (int i = 0; i < vector.length; i++) {
            int count = 0;
            int num = vector[i];

            while (num != 0) {
                int digit = num % 10;
                count++;
                num /= 10;
            }

            System.out.println("El elemento " + i + " del vector tiene " + count + " dígitos.");
        }
    }

}
