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
        salario = salario * aumento;
    }

        public static void main(String[] args) {
            Empleado[] empleados = {
                    new Empleado("Juan", 2000.0, 3),
                    new Empleado("María", 2500.0, 6),
                    new Empleado("Pedro", 3000.0, 8)
            };

            for (Empleado empleado : empleados) {
                if (empleado.getAntiguedad() > 5) {
                    empleado.aplicarAumentoSalario(1.1);
                }
            }

        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Salario actualizado: " + empleado.getSalario());
            System.out.println();
        }
    }
}
