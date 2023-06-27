import java.util.Scanner;

public class Pregunta4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero no negativo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("El número debe ser no negativo.");
        } else {
            long factorial = 1;
            int i = 2;
            while (i <= numero) {
                factorial *= i;
                i++;
            }

            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
    }
}