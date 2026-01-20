public class CastingConversiones {
    public static void main(String[] args) {

        
        int entero = 10;
        double decimal = entero;

        System.out.println("----- Conversión Implícita-----");
        System.out.println("Valor original (int): " + entero);
        System.out.println("Valor convertido (double): " + decimal);

        System.out.println();

       
        double d = 9.7;
        int i = (int) d;

        System.out.println("----Conversión Explícita-----");
        System.out.println("Valor original (double): " + d);
        System.out.println("Valor convertido (int): " + i);
    }
}
