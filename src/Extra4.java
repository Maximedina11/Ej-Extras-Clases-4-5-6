
import java.util.Scanner;

public class Extra4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresa un número entre 1 y 10: ");
        int numero = leer.nextInt();

        if (numero >= 1 && numero <= 10) {
            String[] romanos = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
            System.out.println("El número " + numero + " en números romanos es: " + romanos[numero]);
        } else {
            System.out.println("El número ingresado es mayor a 10");
        }
    }
}
     
