 class Main
{
  public static void main(String[] args)
  {
    Camisa cam1 = new Camisa();
    cam1.marca = "Sarkany";
    cam1.color = "Azul";
    cam1.talle = 39;
    cam1.mostrar();

    Pantalon pan1 = new Pantalon();
    pan1.marca = "Nike";
    pan1.color = "Negro";
    pan1.talle = "L";
    pan1.modelo = "Corto";
    pan1.mostrar();
  }
}