import java.util.ArrayList;

public class Libre extends Alumno{
    private final float PRECIO_HORA = 10;
    private int numeroHorasDiarias;

    public Libre(String dni, String nombre, int curso, String[] nivelAcadémico, ArrayList<Asignatura> listaAsignaturas, int numeroHorasDiarias) {
        super(dni, nombre, curso, nivelAcadémico, listaAsignaturas);
        this.numeroHorasDiarias = numeroHorasDiarias;
    }

    public Libre(String dni, String nombre, int curso, String[] nivelAcadémico, ArrayList<Asignatura> listaAsignaturas) {
        super(dni, nombre, curso, nivelAcadémico, listaAsignaturas);
    }

    public Libre() {
    }

    @Override
    public double pagoMensual() {
        return PRECIO_HORA * numeroHorasDiarias * 30;
    }

    @Override
    public String  mostrarAsignaturas() {
        return "El estudiante libre " + super.getNombre() + " cursa " + (super.getListaAsignaturas());
    }

    @Override
    public String toString() {
        return "Libre{" +
                "PRECIO_HORA=" + PRECIO_HORA +
                ", numeroHorasDiarias=" + numeroHorasDiarias +
                '}';
    }
}