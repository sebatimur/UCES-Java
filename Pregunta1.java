import java.util.Scanner;
public class Pregunta1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero entero:");

        int numero = scanner.nextInt();

        if (numero > 0)
        {
            System.out.println("El numero es positivo");
        }
        else if (numero < 0)
        {
            System.out.print("El numero es negativo");
        }
        else
        {
            System.out.print("El numero 0");
        }
    }
}