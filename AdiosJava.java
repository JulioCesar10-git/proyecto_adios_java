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

        System.out.println("");

        //Clase Persona
        Persona persona1;
        persona1 = new Persona("Juan Jose", "Perez", "Lopez"); 

        persona1.setedad(22);
        persona1.settelefono("247-165-7658");
        persona1.setdomicilio("Calle Siempre Viva 198-A");

        System.out.println("====DATOS DE LA PERSONA====" + persona1.toString());
        System.out.println("");

        scanner.close();
    }
}