import java.util.Scanner;

public class ConversionTemperatura {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione la conversión:");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");
        System.out.print("Opción: ");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            System.out.print("Ingrese la temperatura en Celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("Temperatura en Fahrenheit: " + fahrenheit);
        } else if (opcion == 2) {
            System.out.print("Ingrese la temperatura en Fahrenheit: ");
            double fahrenheit = sc.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println("Temperatura en Celsius: " + celsius);
        } else {
            System.out.println("Opción no válida");
        }

        sc.close();
    }
}
