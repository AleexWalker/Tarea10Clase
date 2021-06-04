import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Objects;

public class Aplicacion {
    private JPanel pnlPrincipal;
    private JButton btnAñadir;
    private JComboBox cmbSeleccion;
    private JButton btnBuscar;
    private JButton btnListar;
    private JButton btnEliminar;
    private JLabel lblMenu;

    private JDialog VentanaAñadirEstudiante;
    private JDialog VentanaAñadirAsignaturas;
    private JDialog VentanaAñadirProfesor;

    private ArrayList<Alumno> listaAlumnos;
    private ArrayList<Asignatura> listaAsignaturas;
    private ArrayList<Profesor> listaProfesores;

    public Aplicacion() {

        //do {

            if (Objects.requireNonNull(cmbSeleccion.getSelectedItem()).toString().equals("Estudiante")) {
                btnAñadir.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        VentanaAñadirEstudiante = new VentanaAñadirEstudiante(listaAlumnos);
                    }
                });

            } else if (cmbSeleccion.getSelectedItem().toString().equals("Asignatura")) {
                btnAñadir.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        VentanaAñadirAsignaturas = new VentanaAñadirAsignaturas(listaAsignaturas);
                    }
                });
            } else if (cmbSeleccion.getSelectedItem().toString().equals("Profesor")){
                btnAñadir.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        VentanaAñadirProfesor = new VentanaAñadirProfesor(listaProfesores);
                    }
                });
            }

        //} while ();

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplicacion");
        frame.setContentPane(new Aplicacion().pnlPrincipal);

        frame.setBounds(100 , 100 , 100 , 100);
        frame.pack();
        frame.setVisible(true);
    }
}
