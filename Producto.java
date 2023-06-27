public class Producto {
    private String nombre;
    private String informacion;
    private double precio;
    private int cantidad;

    public Producto(String nombre, String informacion,double precio, int cantidad) {
        this.nombre = nombre;
        this.informacion = informacion;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }
    public String getInformaicon() {
        return informacion;
    }
    public double getPrecio() {
        return precio;
    }
    public int getCantidad() {
        return cantidad;
    }
    public double precioTotal() {
        return precio * cantidad;
    }

    public static void main(String[] args) {
        Producto[] productos = {
                new Producto("Juego de Mesa: Uno","Para mayores de 8 Años", 6, 5),
                new Producto("LEGO: Star Wars","Para edade entre 3 y 8 Años", 12, 7),
                new Producto("Cartas Truco","Para mayores de 12 años", 2, 18)
        };

        for (Producto producto : productos) {
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Nombre: " + producto.getInformaicon());
            System.out.println("Cantidad: " + producto.getCantidad());
            System.out.println("Valor total: " + producto.precioTotal());
            System.out.println();
        }
    }
}