import java.util.Scanner;

public class CirculoConstantes {

    
    public static final double PI = 3.14159;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el radio del círculo: ");
        double radio = sc.nextDouble();

        double area = PI * radio * radio;
        double perimetro = 2 * PI * radio;

        System.out.println("Área del círculo: " + area);
        System.out.println("Perímetro del círculo: " + perimetro);

        sc.close();
    }
}
