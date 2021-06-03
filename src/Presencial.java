import java.util.ArrayList;

public class Presencial extends Alumno{
    private double matriculaCurso;
    private int numeroConvocatoria;
    private double plusPorConvocatoria;

    public Presencial(String dni, String nombre, int curso, String[] nivelAcadémico, ArrayList<Asignatura> listaAsignaturas, double matriculaCurso, int numeroConvocatoria, double plusPorConvocatoria) {
        super(dni, nombre, curso, nivelAcadémico, listaAsignaturas);
        this.matriculaCurso = matriculaCurso;
        this.numeroConvocatoria = numeroConvocatoria;
        this.plusPorConvocatoria = plusPorConvocatoria;
    }

    public Presencial(double matriculaCurso, int numeroConvocatoria, double plusPorConvocatoria) {
        this.matriculaCurso = matriculaCurso;
        this.numeroConvocatoria = numeroConvocatoria;
        this.plusPorConvocatoria = plusPorConvocatoria;
    }

    public Presencial() {
    }

    @Override
    public double pagoMensual() {
        return (matriculaCurso + plusPorConvocatoria * numeroConvocatoria)/12;
    }

    @Override
    public String mostrarAsignaturas() {
        return "El estudiante presencial " + super.getNombre() + " cursa " + (super.getListaAsignaturas());
    }
}