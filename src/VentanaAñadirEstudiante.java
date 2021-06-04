import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.util.ArrayList;
import java.util.Objects;

public class VentanaAñadirEstudiante extends JDialog{

    private JPanel pnlPrincipal;
    private JLabel lblEstudiante;
    private JTextField txtDNI;
    private JTextField txtNombre;
    private JTextField txtCurso;
    private JRadioButton rbtPresencial;
    private JRadioButton rbtLibre;
    private JSpinner spnConvocatoria;
    private JButton btnAceptar;
    private JLabel lblDNI;
    private JLabel lblNombre;
    private JLabel lblConvocatoria;
    private JLabel lblCurso;
    private JLabel lblNivel;
    private JComboBox cmbNivel;
    private JList lstAsignaturas;


    private static ArrayList<Alumno> listaAlumnos;
    private static ArrayList<Asignatura> listaAsignaturas;

    private Alumno auxiliarAlumnos;
    private Asignatura auxiliarAsignaturas;

    private String DNI;
    private String nombre;
    private String nivel;
    private int curso;
    private boolean libre = false;
    private boolean presencial = false;
    private int convocatoria;

    public VentanaAñadirEstudiante(ArrayList<Alumno> listaAlumnos) {

        JFrame frame = new JFrame("VentanaAñadirEstudiante");
        setContentPane(pnlPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(250 , 250 , 500 , 500);
        setVisible(true);
        pack();

        txtDNI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DNI = txtDNI.getText();
            }
        });
        txtNombre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nombre = txtNombre.getText();
            }
        });
        txtCurso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                curso = Integer.parseInt(txtCurso.getText());
            }
        });
        rbtPresencial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (rbtLibre.isSelected()){
                    libre = true;
                }
                if (rbtPresencial.isSelected()){
                    presencial = true;
                }
            }
        });

        spnConvocatoria.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                convocatoria = (int) spnConvocatoria.getValue();
            }
        });
        cmbNivel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nivel = Objects.requireNonNull(cmbNivel.getSelectedItem()).toString();
            }
        });
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (libre){
                    //Alumno auxiliarAlumno = new Libre( DNI , nombre , curso , nivel , );
                }
                if (presencial){
                    Alumno auxiliarAlumno = new Presencial();
                }
                listaAlumnos.add(auxiliarAlumnos);
                JOptionPane.showMessageDialog(null , "Alumno guardado en el sistema");
            }
        });

        lstAsignaturas.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                DefaultListModel modelo = new DefaultListModel();
                modelo.add(1 , listaAsignaturas);
            }
        });
    }
}
