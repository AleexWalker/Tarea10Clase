import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VentanaAñadirProfesor extends JDialog{
    private JPanel pnlPrincipal;
    private JLabel lblDocente;
    private JTextField txtDNI;
    private JTextField txtNombre;
    private JButton btnAceptar;
    private JLabel lblDNI;
    private JLabel lblNombre;
    private JLabel lblAsignatura;
    private JComboBox cmbAsignaturas;

    private static ArrayList<Profesor> listaProfesores;
    private static ArrayList<Asignatura> listaAsignaturas;
    private Profesor auxiliarProfesor;

    private String DNI;
    private String nombre;

    public VentanaAñadirProfesor(ArrayList<Profesor> listaProfesores) {

        JFrame frame = new JFrame("VentanaAñadirProfesor");
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
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                auxiliarProfesor = new Profesor(DNI , nombre , (String) cmbAsignaturas.getSelectedItem());
                listaProfesores.add(auxiliarProfesor);
                JOptionPane.showMessageDialog(null , "Profesor guardado en el sistema");
            }
        });
    }
}
