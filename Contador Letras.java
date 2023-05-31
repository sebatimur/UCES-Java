package EjemplosClases.Arrays;
public class ContadorLetras
{
    public static void main(String[] args)
    {
        String[] palabras = {"pepe", "jose", "carlos", "matias", "eduardo", "jesus"};
        char caracter = 'j';
        int contadorLetra = 0;
        for (String palabra : palabras)
        {
            if (palabra.charAt(0) == caracter)
            {
                contadorLetra++;
            }
        }
        System.out.println("La cantidad de palabras que comienzan con la letra " + caracter + " es: " + contadorLetra);
    }
}