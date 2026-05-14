import java.util.Scanner;

public class AdiosJava{

    public static int resta(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        
        int numero1, numero2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe el numero 1");
        numero1 = scanner.nextInt();
        
        System.out.println("Escribe el numero 2");
        numero2 = scanner.nextInt();

        int resultado = numero1 + numero2;
        System.out.println("La suma es: " + resultado);

        int resta = resta(numero1, numero2);
        System.out.println("La resta es: " + resta);
        
        scanner.close();
    }
}