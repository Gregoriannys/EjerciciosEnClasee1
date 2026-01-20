import java.util.Scanner;

public class PatronAsteriscos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de líneas: ");
        int lineas = sc.nextInt();

        // Patrón normal
        System.out.println("\nPatrón creciente:");
        for (int i = 1; i <= lineas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Patrón invertido (BONUS)
        System.out.println("\nPatrón decreciente:");
        for (int i = lineas; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
