import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class VentanaEvento01 extends JFrame implements ActionListener{
    JButton b1 = new JButton("Click aquí");

    public VentanaEvento01(){
        super("Ventana 01");
        GridBagConstraints gbc = new GridBagConstraints();
        Container cont = getContentPane();
        cont.setLayout(new GridBagLayout());
        setBounds(200,100,300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        gbc.gridx = 1;
        gbc.gridy = 1;
        cont.add(b1, gbc);
        b1.addActionListener(this);
        setVisible(true);
    }//Constructor

    public void actionPerformed(ActionEvent event){
        JOptionPane.showMessageDialog(null,"El comando es \""+
        event.getActionCommand() +"\"");
    }//actionPerformed

    public static void main(String[] args) {
        VentanaEvento01 v1 = new VentanaEvento01();
    }//main
}//class VentanaEvento01
