import java.util.Scanner;

public class Extra9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el dividendo: ");
        int dividendo = leer.nextInt();
        System.out.print("Ingrese el divisor: ");
        int divisor = leer.nextInt();
        
        int resto = dividendo;
        int cociente = 0;
        while(resto >= divisor) {
            resto = resto - divisor;
            cociente++;
        }
        
        System.out.println("El cociente es: " + cociente);
        System.out.println("El residuo es: " + resto);
    }
}

