import java.util.ArrayList;
import java.util.Arrays;

public abstract class Alumno extends Persona{
    private int curso;
    private String [] nivelAcadémico = {"FPB" , "CFGM" , "CFGS" , "CE"};
    private ArrayList <Asignatura> listaAsignaturas;
    private ArrayList <Alumno> listaAlumnos;

    public Alumno(String dni, String nombre, int curso, String[] nivelAcadémico, ArrayList<Asignatura> listaAsignaturas) {
        super(dni, nombre);
        this.curso = curso;
        this.nivelAcadémico = nivelAcadémico;
        this.listaAsignaturas = listaAsignaturas;
    }

    public Alumno(int curso, String[] nivelAcadémico, ArrayList<Asignatura> listaAsignaturas) {
        this.curso = curso;
        this.nivelAcadémico = nivelAcadémico;
        this.listaAsignaturas = listaAsignaturas;
    }

    public Alumno() {
    }

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public String[] getNivelAcadémico() {
        return nivelAcadémico;
    }

    public void setNivelAcadémico(String[] nivelAcadémico) {
        this.nivelAcadémico = nivelAcadémico;
    }

    public ArrayList<Asignatura> getListaAsignaturas() {
        return listaAsignaturas;
    }

    public void setListaAsignaturas(ArrayList<Asignatura> listaAsignaturas) {
        this.listaAsignaturas = listaAsignaturas;
    }

    public abstract double pagoMensual();

    public abstract String mostrarAsignaturas();

    @Override
    public String toString() {
        return "Alumno{" +
                "curso=" + curso +
                ", nivelAcadémico=" + Arrays.toString(nivelAcadémico) +
                ", listaAsignaturas=" + listaAsignaturas +
                '}';
    }
}
