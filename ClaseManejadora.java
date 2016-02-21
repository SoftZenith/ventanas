import java.awt.event.*;
import javax.swing.JOptionPane;

public class ClaseManejadora implements ActionListener{
    public void actionPerformed(ActionEvent event){
        JOptionPane.showMessageDialog(null, "El comando es \" "+
        event.getActionCommand()+"\"");
    }
}
