import java.util.Scanner;

public class CalculadoraMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de Calculadora ---");
            System.out.println("1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese el primer número: ");
                double n1 = sc.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                double n2 = sc.nextDouble();

                switch (opcion) {
                    case 1 -> System.out.println("Resultado: " + (n1 + n2));
                    case 2 -> System.out.println("Resultado: " + (n1 - n2));
                    case 3 -> System.out.println("Resultado: " + (n1 * n2));
                    case 4 -> {
                        if (n2 != 0) {
                            System.out.println("Resultado: " + (n1 / n2));
                        } else {
                            System.out.println("Error: No se puede dividir por cero.");
                        }
                    }
                }
            }
        } while (opcion != 5);

        System.out.println("Listo!.");
        sc.close();
    }
}