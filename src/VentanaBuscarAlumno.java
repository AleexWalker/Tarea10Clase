import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VentanaBuscarAlumno {
    private JPanel pnlPrincipal;
    private JLabel lblBuscar;
    private JTextField txtDNI;
    private JLabel lblDNI;
    private JButton btnBuscar;

    private ArrayList<Alumno> listaAlumnos;
    private Alumno auxiliarAlumno;
    private Persona auxiliarPersona;
    private String entrada;

    public VentanaBuscarAlumno() {

        listaAlumnos = auxiliarAlumno.getListaAlumnos();

        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                entrada = txtDNI.getText();
            }
        });

        for (int i = 0 ; i < listaAlumnos.size() ; i++){
            if (listaAlumnos.get(i).getDni().equals(entrada))
                JOptionPane.showMessageDialog(null , "Alumno con DNI: " + entrada + " ha sido encontrado");
            else
                JOptionPane.showMessageDialog(null , "Alumno con DNI: " + entrada + " no encontrado");
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("VentanaBuscarAlumno");
        frame.setContentPane(new VentanaBuscarAlumno().pnlPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(250 , 250 ,500 , 500);
        frame.pack();
        frame.setVisible(true);
    }
}
