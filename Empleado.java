public class Empleado {
    private String nombre;
    private double salario;
    private int antiguedad;

    public Empleado(String nombre, double salario, int antiguedad) {
        this.nombre = nombre;
        this.salario = salario;
        this.antiguedad = antiguedad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void aplicarAumentoSalario(double aumento) {
        salario += salario * aumento;
    }

    public static void main(String[] args) {
        // Crear array de objetos Empleado
        Empleado[] empleados = new Empleado[3];

        // Inicializar empleados
        empleados[0] = new Empleado("Juan", 2000.0, 3);
        empleados[1] = new Empleado("Maria", 2500.0, 6);
        empleados[2] = new Empleado("Pedro", 3000.0, 8);

        // Aplicar aumento salarial a empleados con más de 5 años de antigüedad
        for (Empleado empleado : empleados) {
            if (empleado.getAntiguedad() > 5) {
                empleado.aplicarAumentoSalario(0.1); // 10% de aumento
            }
        }

        // Mostrar nombre y salario actualizado de cada empleado
        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Salario actualizado: " + empleado.getSalario());
            System.out.println();
        }
    }
}
