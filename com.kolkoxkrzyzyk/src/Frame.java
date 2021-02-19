import javax.swing.JFrame;

public class Frame extends JFrame {
    public static final long serialVersionUID = 1L;
    public Frame(){
        super("Kółko i krzyżyk");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,400);
        setLocation(700,200);



        setVisible(true);
    }
    
}
