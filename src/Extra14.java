import java.util.Scanner;

public class Extra14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de familias: ");
        int numFamilias = leer.nextInt();

        int sumaEdades = 0;
        int cantidadHijos = 0;

        for (int i = 1; i <= numFamilias; i++) {
            System.out.print("Ingrese la cantidad de hijos de la familia " + i + ": ");
            int numHijos = leer.nextInt();
            
            for (int j = 1; j <= numHijos; j++) {
                System.out.print("Ingrese la edad del hijo " + j + " de la familia " + i + ": ");
                int edad = leer.nextInt();
                sumaEdades += edad;
                cantidadHijos++;
            }
        }

        double mediaEdad = (double) sumaEdades / cantidadHijos;
        System.out.println("La media de edad de los hijos de todas las familias es: " + mediaEdad);
    }
}
