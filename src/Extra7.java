import java.util.Scanner;

public class Extra7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números: ");
        int n = leer.nextInt();
        
        double sum = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        
        int cont = 0;
        while (cont < n) {
            System.out.print("Ingrese un número: ");
            double num = leer.nextDouble();
            
            sum += num;
            max = Math.max(max, num);
            min = Math.min(min, num);
            
            cont++;
        }
        
        double prom = sum / n;
        
        System.out.println("El valor máximo es: " + max);
        System.out.println("El valor mínimo es: " + min);
        System.out.println("El promedio es: " + prom);
    }
}
