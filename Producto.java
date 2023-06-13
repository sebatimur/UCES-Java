public class Producto {
        private String nombre;
        private double precio;
        private int cantidad;

        public Producto(String nombre, double precio, int cantidad) {
            this.nombre = nombre;
            this.precio = precio;
            this.cantidad = cantidad;
        }

        public String getNombre() {
            return nombre;
        }

        public double getPrecio() {
            return precio;
        }

        public int getCantidad() {
            return cantidad;
        }

        public double getValorTotal() {
            return precio * cantidad;
        }

        public static void main(String[] args) {
            Producto[] productos = new Producto[3];

            // Crear objetos Producto y agregarlos al array
            productos[0] = new Producto("Producto 1", 10.99, 2);
            productos[1] = new Producto("Producto 2", 5.49, 5);
            productos[2] = new Producto("Producto 3", 2.99, 10);

            // Mostrar el nombre y el valor total de cada producto
            for (Producto producto : productos) {
                System.out.println("Nombre: " + producto.getNombre());
                System.out.println("Valor total: " + producto.getValorTotal());
                System.out.println();
            }
        }
}