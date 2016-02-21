import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class VentanaEvento02 extends JFrame{

    JButton b1 = new JButton("Click aquí");

    public VentanaEvento02(){
        super("Ventana 02");
        GridBagConstraints gbc = new GridBagConstraints();
        Container cont = getContentPane();
        cont.setLayout(new GridBagLayout());
        setBounds(200,100,300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        gbc.gridx = 1;
        gbc.gridy = 1;
        cont.add(b1, gbc);
        b1.addActionListener(new ClaseManejadora());
        setVisible(true);
    }//Constructor

    public static void main(String[] args) {
        VentanaEvento02 v2 = new VentanaEvento02();
    }

}//class VentanaEvento02
