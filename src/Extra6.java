import java.util.Scanner;

public class Extra6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Pedir número de personas
        System.out.print("Ingrese el número de personas: ");
        int n = leer.nextInt();

        // Declarar variables para el cálculo de promedios
        double sumaTotal = 0;
        double sumaMenor160 = 0;
        int contadorTotal = 0;
        int contadorMenor160 = 0;

        // Pedir estaturas y calcular promedios
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese la estatura de la persona " + i + ": ");
            double estatura = leer.nextDouble();

            // Acumular estatura en sumaTotal y aumentar contadorTotal
            sumaTotal += estatura;
            contadorTotal++;

            // Si la estatura es menor a 1.60, acumular en sumaMenor160 y aumentar contadorMenor160
            if (estatura < 1.60) {
                sumaMenor160 += estatura;
                contadorMenor160++;
            }
        }

        // Calcular promedio de estaturas menores a 1.60 mts
        double promedioMenor160 = contadorMenor160 > 0 ? sumaMenor160 / contadorMenor160 : -1;

        // Calcular promedio general de estaturas 
       double promedioGeneral = sumaTotal / contadorTotal;

        // Mostrar resultados
        System.out.println("El promedio de estaturas menores a 1.60 mts es: " + (promedioMenor160 == -1 ? "No hay estaturas menores a 1.60 mts" : promedioMenor160));
        System.out.println("El promedio general de estaturas es: " + promedioGeneral);

        
    }
}
