import javax.swing.*;
import java.awt.event.*;
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

    private static int seleccion;

    public Aplicacion() {


        cmbSeleccion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int seleccion = cmbSeleccion.getSelectedIndex();
                switch (seleccion){
                    case 0:
                        btnAñadir.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                VentanaAñadirEstudiante = new VentanaAñadirEstudiante(listaAlumnos);
                                cmbSeleccion.setSelectedItem(0);
                            }
                        });
                        break;
                    case 1:
                        btnAñadir.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                VentanaAñadirAsignaturas = new VentanaAñadirAsignaturas(listaAsignaturas);
                                cmbSeleccion.setSelectedItem(0);
                            }
                        });
                        break;
                    case 2:
                        btnAñadir.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                VentanaAñadirProfesor = new VentanaAñadirProfesor(listaProfesores);
                                cmbSeleccion.setSelectedItem(0);
                            }
                        });
                        break;
                }
            }
        });

        /*
        seleccion = 0;
        cmbSeleccion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seleccion = cmbSeleccion.getSelectedIndex();
                if (seleccion == 0) {
                    btnAñadir.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                            VentanaAñadirEstudiante = new VentanaAñadirEstudiante(listaAlumnos);
                        }
                    });

                } else if (seleccion == 1) {
                    btnAñadir.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            seleccion = 0;
                            VentanaAñadirAsignaturas = new VentanaAñadirAsignaturas(listaAsignaturas);
                        }
                    });
                } else if (seleccion == 2) {
                    btnAñadir.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            seleccion = 0;
                            VentanaAñadirProfesor = new VentanaAñadirProfesor(listaProfesores);
                        }
                    });
                }
            }
        });
    */
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplicacion");
        frame.setContentPane(new Aplicacion().pnlPrincipal);
        frame.setBounds(100 , 100 , 100 , 100);
        frame.pack();
        frame.setVisible(true);
    }
}
