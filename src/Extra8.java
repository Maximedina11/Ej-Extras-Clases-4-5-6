import java.util.Scanner;

public class Extra8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, cont = 0, pares = 0, impares = 0;

        while (true) {
            System.out.print("Ingrese un número entero: ");
            num = leer.nextInt();

            if (num < 0) {
                continue; // Ignoramos los números negativos y volvemos al inicio del bucle
            }

            cont++;

            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            if (num % 5 == 0) {
                System.out.println("Ha ingresado un múltiplo de 5.");
                break; // Salimos del bucle al encontrar un múltiplo de 5
            }
        }

        System.out.println("Cantidad de números leídos: " + cont);
        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
    }
}
