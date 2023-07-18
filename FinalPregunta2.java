public class FinalPregunta2 {
    public static void main(String[] args)
    {
        int[] array = {1, 2, 3, 4, 5};
        int suma = FinalPregunta2(array);
        System.out.println("La suma de todos los numeros es: " + suma);
    }
    public static int FinalPregunta2(int[] array)
    {
        int suma = 0;

        for (int i = 0; i < array.length; i++)
        {
            suma = suma + array[i];
        }
        return suma;
    }
}
