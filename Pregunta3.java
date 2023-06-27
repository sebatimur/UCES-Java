import java.util.Scanner;

public class Pregunta3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un texto: ");
        String texto = scanner.nextLine();

        int contadorVocales = 0;

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' || caracter ==h 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U')
            {
                contadorVocales++;
            }
        }

        System.out.println("El número de vocales en el texto es: " + contadorVocales);
    }
}