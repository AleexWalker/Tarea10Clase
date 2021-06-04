import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VentanaAñadirAsignaturas extends JDialog{
    private JPanel pnlPrincipal;
    private JLabel lblAsignatura;
    private JLabel lblCurso;
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JSpinner spnCurso;
    private JButton btnAceptar;
    private JComboBox cmbCurso;

    private String nombreAsignatura;
    private int curso;
    private static ArrayList<Asignatura> listaAsignaturas;
    private Asignatura auxiliarAsignatura;
    private Alumno auxiliarAlumno;

    public VentanaAñadirAsignaturas(ArrayList<Asignatura> listaAsignaturas) {

        JFrame frame = new JFrame("VentanaAñadirAsignaturas");
        setContentPane(pnlPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(250 , 250 , 500 , 500);
        setVisible(true);
        pack();

        txtNombre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nombreAsignatura = txtNombre.getText();
            }
        });

        cmbCurso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                curso = cmbCurso.getSelectedIndex();
            }
        });

        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                auxiliarAsignatura = new Asignatura(nombreAsignatura , curso);
                listaAsignaturas.add(auxiliarAsignatura);
                JOptionPane.showMessageDialog(null , "Asignatura guardada en la base de datos");
            }
        });
    }
}
