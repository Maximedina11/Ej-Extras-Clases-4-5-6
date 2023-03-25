import java.util.Scanner;

public class Extra5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresa la clase del socio (A, B o C): ");
        String clase = leer.nextLine().toUpperCase();

        System.out.print("Ingresa el costo del tratamiento: ");
        double costo = leer.nextDouble();

        double descuento = 0.0;

        switch (clase) {
            case "A":
                descuento = 0.5;
                break;
            case "B":
                descuento = 0.35;
                break;
            case "C":
                descuento = 0.0;
                break;
            default:
                System.out.println("Clase de socio inexistente.");
                return;
        }

        double importeAPagar = costo * (1 - descuento);

        System.out.println("El importe a pagar para el socio de clase " + clase + " es de $" + importeAPagar);

        
    }

}

