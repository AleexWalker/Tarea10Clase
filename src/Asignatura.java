import java.util.ArrayList;

public class Asignatura {
    private String nombre;
    private int curso;
    private Profesor profesor;
    private ArrayList <Alumno> listaEstudiantes;

    public Asignatura(String nombre, int curso, Profesor profesor, ArrayList<Alumno> listaEstudiantes) {
        this.nombre = nombre;
        this.curso = curso;
        this.profesor = profesor;
        this.listaEstudiantes = listaEstudiantes;
    }

    public Asignatura() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public ArrayList<Alumno> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Alumno> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "nombre='" + nombre + '\'' +
                ", curso=" + curso +
                ", profesor=" + profesor +
                ", listaEstudiantes=" + listaEstudiantes +
                '}';
    }
}
