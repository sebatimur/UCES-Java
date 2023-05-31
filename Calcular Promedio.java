package EjemplosClases.Arrays;

import java.util.Scanner;

public class Arrays
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese el numero de estudiantes: ");
        int numeroEstudiantes = scanner.nextInt();

        int[] calificaciones = new int[numeroEstudiantes];

        for (int i = 0; i < numeroEstudiantes; i++) {
            int calificacion;
            do
            {
                System.out.println("Por favor ingrese la calificación (entre 1 y 10) del estudiante " + (i + 1) + ": ");
                calificacion = scanner.nextInt();
            }
            while (calificacion <= 0 || calificacion >= 11);
            calificaciones[i] = calificacion;
        }

        int suma = 0;
        for (int i = 0; i < numeroEstudiantes; i++) {
            suma += calificaciones[i];
        }

        double promedio = (double) suma / numeroEstudiantes;
        System.out.println("El promedio de todas las calificaciones es: " + promedio);
    }
}
