import java.util.Scanner;

public class Extra1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa el tiempo en minutos: ");
        int minutos = leer.nextInt();

        // Calculamos los días, horas y minutos
        int dias = minutos / 1440;
        int horas = (minutos % 1440) / 60;
        int minutosRestantes = minutos % 60;

        
        System.out.println(minutos + " minutos equivalen a " + dias + " día(s), " + horas + " hora(s) y " + minutosRestantes + " minuto(s).");
    }
}
