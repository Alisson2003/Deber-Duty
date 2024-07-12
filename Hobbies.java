import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hobbies extends JFrame {
    private JPanel Panel3;
    private JButton Regresar;
    private JButton Salir;
    private JLabel Imagen;

    public Hobbies(){
        super("Hobbies o Aficiones");
        //setContentPane(Panel3);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel3 = new JPanel();
        Panel3.setLayout(new BorderLayout());
        setContentPane(Panel3);

        ImageIcon icon = new ImageIcon(getClass().getResource("C:\\POO-EPN\\Duty\\imagen"));
        Imagen.setIcon(icon);
        Panel3.add(Imagen, BorderLayout.CENTER);

        Regresar = new JButton("Regresando ... ");
        Regresar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Biografia biografiaFrame = new Biografia();
                biografiaFrame.setVisible(true);
                dispose();
            }
        });
        Panel3.add(Regresar, BorderLayout.SOUTH);

        Salir = new JButton("Salir");
        Salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        Panel3.add(Salir, BorderLayout.SOUTH);
    }
}
