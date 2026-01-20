import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();

        boolean esPrimo = true;

        if (numero <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= numero - 1; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            System.out.println("El número " + numero + " es primo.");
        } else {
            System.out.println("El número " + numero + " NO es primo.");
        }

        sc.close();
    }
}
