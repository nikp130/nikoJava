
import java.util.Scanner; // Este es el importe de la clase Scanner
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner leer = new Scanner(System.in); // Creamos el Scanner
        System.out.println("Ingrese numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese numero");
        int num2 = leer.nextInt();

        short suma = (short) (num1 + num2);

        System.out.print("la suma" + suma);







    }
}
