import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Biografia extends JFrame {
    private JPanel Panel2;
    private JTextArea biografia;
    private JButton Siguiente;

    public Biografia() {
        super("BIOGRAFIA");
        setContentPane(Panel2);
        setSize(400, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel2 = new JPanel();
        Panel2.add(biografia);
        setContentPane(Panel2);


        biografia.setText("Mi nombre es: Alisson Viracocha\n" +
                "Tengo 20 años\n" +
                "Estudio la carrera de Tecnología Superior en Desarrollo de Software en la EPN\n" +
                "Mi aficion favorita es escuchar música y jugar boly\n" +
                "Mi mascota es un perrito llamado Gojo de rasa Haski\n" +
                "Una de las cosas que mas me apasiona es la Criminalistica\n"+
                "es una carrera que pienso estudiar despues de terminar la tecnologia");

        Siguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Hobbies hobbiesFrame = new Hobbies();
                hobbiesFrame.setVisible(true);
                dispose();
            }
        });
        Panel2.add(Siguiente);

        setLocationRelativeTo(null);
    }
}
