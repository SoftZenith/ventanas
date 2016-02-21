import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class ManejoEventosRaton extends JFrame{
    JButton mouseButton = new JButton("Sin eventos de movimiento aún");

    public ManejoEventosRaton(){
        super("Manejo de eventos del ratón");
        this.initFrame();
    }

    private void initFrame(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.getContentPane().add(mouseButton);

        //agrega un MouseListener al JButton
        mouseButton.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent e){ /*override*/}
            public void mousePressed(MouseEvent e){/*override*/}
            public void mouseReleased(MouseEvent e){/*override*/}
            public void mouseEntered(MouseEvent e){/*override*/
                mouseButton.setText("Entrando al boton");
            }
            public void mouseExited(MouseEvent e){//override
                mouseButton.setText("Saliendo del botón");
            }
        });
    }//initFrame

    public static void main(String[] args) {
        ManejoEventosRaton frame = new ManejoEventosRaton();
        frame.pack();
        frame.setVisible(true);
    }
}
