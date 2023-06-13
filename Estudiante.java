public class Estudiante {
    private String nombre;
    private int edad;
    private double[] calificaciones;

    public Estudiante(String nombre, int edad, double[] calificaciones) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificaciones = calificaciones;
    }

    public double calcularPromedio() {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        double promedio = suma / calificaciones.length;
        return promedio;
    }

    public static void main(String[] args) {
        Estudiante[] estudiantes = {
                new Estudiante("Juan", 20, new double[]{8.5, 7.9, 6.3}),
                new Estudiante("María", 19, new double[]{9.1, 8.8, 9.4}),
                new Estudiante("Pedro", 21, new double[]{7.6, 8.2, 7.8})
        };

        for (Estudiante estudiante : estudiantes) {
            double promedio = estudiante.calcularPromedio();
            System.out.println("Estudiante: " + estudiante.nombre + ", Promedio de calificaciones: " + promedio);
        }
    }
}
