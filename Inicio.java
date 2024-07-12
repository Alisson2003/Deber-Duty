import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Inicio extends JFrame {
    private JPanel Panel1;
    private JTextField user;
    private JPasswordField password;
    private JButton INICIARButton;

    public Inicio() {
        super("Bienvenido al Login");
        setContentPane(Panel1);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String usuario = "1234";
        String contraseña ="luna";


        INICIARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = user.getText();
                String contraseña = new String(password.getText());


                if(usuario.equals(usuario) && contraseña.equals(contraseña)){
                    Biografia biografiaFrame = new Biografia();
                    biografiaFrame.setVisible(true);
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(null,"CREDENCIALES INCORRECTAS","ERROR",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
