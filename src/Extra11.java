import java.util.Scanner;

public class Extra11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduzca un número entero: ");
        int numero = leer.nextInt();
        int contador = 0;
        while(numero != 0) {
            numero = numero / 10;
            contador++;
        }
        System.out.println("El número tiene " + contador + " dígitos.");
    }
}

