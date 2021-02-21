import java.awt.*;
import java.awt.event.*;

public class op extends Frame implements WindowListener,ActionListener {
 
    private static final long serialVersionUID = 1L;
    TextField text = new TextField(20);
        Button b;
        Button a;
        int numClicks = 0;

        public static void main(String[] args) {
                op myWindow = new op("My first window");
                myWindow.setSize(350,100);
                myWindow.setVisible(true);
                myWindow.setLocation(800, 200);
        }

        public op(String title) {

                super("OKIENKO");
                setLayout(new FlowLayout());
                addWindowListener(this);
                b = new Button("Click me");
                add(b);
                add(text);
                b.addActionListener(this);
        }

        public void actionPerformed(ActionEvent e) {
                numClicks++;
                text.setText("Hello "+numClicks+" .");
        }

        public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
        }

        public void windowOpened(WindowEvent e) {}
        public void windowActivated(WindowEvent e) {}
        public void windowIconified(WindowEvent e) {}
        public void windowDeiconified(WindowEvent e) {}
        public void windowDeactivated(WindowEvent e) {}
        public void windowClosed(WindowEvent e) {}

}