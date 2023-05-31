package EjemplosClases.Arrays;

public class Arrays
{
    public static void main(String[] args)
    {
        String[] palabras = {"pepasdade", "josedsasda", "carasdsdalos", "matiasadas", "eduardsado", "jessaus"};
        String palabraLarga = palabras[0];
        int i;
        for(i = 1; i < palabras.length; i++)
        {
            if (palabras[i].length()>palabraLarga.length())
            {
            palabraLarga=palabras[i];
            }
        }
        System.out.println("La palabra mas larga es " + palabraLarga + " que contiene " + palabraLarga.length() + " caracteres y hay en total " + i + " de palabras");
    }
}