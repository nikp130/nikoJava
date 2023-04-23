import java.util.Scanner; // Este es el importe de la clase Scanner

import javax.lang.model.util.ElementScanner6;
public class App Guia3Ejemplo {
    public static void main(String[] args) throws Exception {
        System.out.println("Clasififique la peli de 1 al 5 estrellas");
        Scanner leer = new Scanner(System.in); // Creamos el Scanner
        opinion = leer.nextInt();

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
