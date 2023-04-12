class Main
{
  public static void main(String[] args)
  {
    Camisa cam1 = new Camisa();
    cam1.marca = "Puma";
    cam1.color = "Rola";
    cam1.talle = "M";
    cam1.mostrar();
    
    Pantalon pan1 = new Pantalon();
    pan1.marca = "Nike";
    pan1.color = "Negro";
    pan1.talle = "L";
    pan1.modelo = "Corto";
    pan1.mostrar();

    Zapatillas zap1 = new Zapatillas();
    zap1.marca = "Adidas";
    zap1.color = "Blancas";
    zap1.talle = 40;
    zap1.mostrar();
  }
}