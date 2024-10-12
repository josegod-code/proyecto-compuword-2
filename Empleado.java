public class Empleado {
    private String nombre;
    private String id;
    private String tipo; // Permanente o Temporal
    private Departamento departamento;

    // Constructor
    public Empleado(String nombre, String id, String tipo) {
        this.nombre = nombre;
        this.id = id;
        this.tipo = tipo;
        this.departamento = null; // Inicialmente sin departamento
    }

    // Métodos getters
    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    // Método para asignar departamento
    public void asignarDepartamento(Departamento desarrollo) {
        this.departamento = desarrollo; // Asigna el departamento al empleado
    }

    // Método para obtener información del empleado
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", tipo='" + tipo + '\'' +
                ", departamento='" + departamento + '\'' +
                '}';
    }
}
