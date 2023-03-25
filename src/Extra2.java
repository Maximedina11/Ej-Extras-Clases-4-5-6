public class Extra2 {
    public static void main(String[] args) {
        // Declarar las cuatro variables
        int A = 2, B = 5, C = 8, D = 3;

        // Imprimir los valores iniciales
        System.out.println("Valores iniciales:");
        System.out.println("A = " + A + ", B = " + B + ", C = " + C + ", D = " + D);

        
        int aux = B; // El valor de B se guarda en la var auxiliar
        B = C;
        C = A;
        A = D;
        D = aux;

        
        System.out.println("Valores finales:");
        System.out.println("A = " + A + ", B = " + B + ", C = " + C + ", D = " + D);
    }
}

