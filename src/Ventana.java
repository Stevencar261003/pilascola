import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JPanel principal;
    private JComboBox cboPrioridad;
    private JTextField textSintoma;
    private JTextField txtNOMBRE;
    private JButton btnRegistrar;
    private JList IstListaPaciente;
    private JButton btnAtender;
    DefaultListModel dlm=new DefaultListModel();

    Clinica clinica=new Clinica();
    private JTextField textNOMBRE;

    public void llenarList(){
        for(Paciente p: clinica.listarPaciente()){
            dlm.addElement(p);
        }
        IstListaPaciente.setModel(dlm);
    }
    public Ventana() {
        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent  ) {
                int p=Integer.parseInt(cboPrioridad.getSelectedItem().toString());
                String nombre=txtNOMBRE.getText();
                String sintomas=textSintoma.getText();
                Paciente nuevo=new Paciente(p,nombre,sintomas);
                clinica.encolar(nuevo);
                llenarList();

            }
        });
    }
}
