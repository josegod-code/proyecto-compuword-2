public class Main {
    public static void main(String[] args) {
        // Crear departamentos
        Departamento desarrollo = new Departamento("Desarrollo");
        Departamento recursosHumanos = new Departamento("Recursos Humanos");

        // Crear empleados
        Empleado empleado1 = new Empleado("Juan Pérez", "E001", "permanente");
        Empleado empleado2 = new Empleado("Ana Gómez", "E002", "temporal");

        // Asignar empleados a departamentos
        empleado1.asignarDepartamento(desarrollo);
        empleado2.asignarDepartamento(recursosHumanos);

        // Crear reporte de desempeño
        ReporteDesempeño reporte = new ReporteDesempeño();
        reporte.agregarDesempeño(empleado1, 85.0);
        reporte.agregarDesempeño(empleado2, 90.0);

        // Generar y mostrar el reporte
        reporte.generarReporte();
    }
}


