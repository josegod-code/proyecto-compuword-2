import java.util.HashMap;
import java.util.Map;

public class ReporteDesempeño {
    private Map<Empleado, Double> desempeño;

    public ReporteDesempeño() {
        this.desempeño = new HashMap<>();
    }

    public void agregarDesempeño(Empleado empleado, double puntuacion) {
        if (puntuacion < 0 || puntuacion > 100) {
            throw new IllegalArgumentException("Puntuación debe estar entre 0 y 100");
        }
        desempeño.put(empleado, puntuacion);
    }

    public Double obtenerDesempeño(Empleado empleado) {
        return desempeño.get(empleado);
    }

    public void generarReporte() {
        System.out.println("Reporte de Desempeño:");
        for (Map.Entry<Empleado, Double> entry : desempeño.entrySet()) {
            System.out.println(entry.getKey().getNombre() + ": " + entry.getValue());
        }
    }
}
