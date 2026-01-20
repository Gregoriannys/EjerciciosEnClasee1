import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la calificación (0 - 100): ");
        int nota = sc.nextInt();

        char letra;

        if (nota >= 90 && nota <= 100) {
            letra = 'A';
        } else if (nota >= 80) {
            letra = 'B';
        } else if (nota >= 70) {
            letra = 'C';
        } else if (nota >= 60) {
            letra = 'D';
        } else if (nota >= 0) {
            letra = 'F';
        } else {
            System.out.println("Calificación inválida");
            sc.close();
            return;
        }

        System.out.println("Calificación en letra: " + letra);

        if (nota >= 70) {
            System.out.println("Estado: Aprobado");
        } else {
            System.out.println("Estado: Reprobado");
        }

        sc.close();
    }
}
