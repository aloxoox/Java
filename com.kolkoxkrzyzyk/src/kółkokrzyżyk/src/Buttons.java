import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
public class Buttons extends JPanel implements ActionListener{
    private static final long serialVersionUID = 1L;
    JButton reset;
    JButton[] button = new JButton[9];
    boolean myTurn = true;
    public Buttons(){
      for (int i = 0; i < button.length; i++){
          button[i] = new JButton("");
          button[i].addActionListener(this);
          button[i].setBackground(Color.WHITE);
          add(button[i]);
      }
      reset = new JButton("RESET");
      reset.addActionListener(this);
      reset.setBackground(Color.WHITE);
      add(reset);
      setLayout(new GridLayout(4, 3));
    }
    @Override
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        char symbol = 'X';
        if(myTurn){
          symbol = 'O';
        }
        myTurn = !myTurn;
        for (int i = 0; i < button.length; i++){
          if (source.equals(reset)) {
            button[i].setText("");
            button[i].setEnabled(true);
            button[i].setBackground(Color.WHITE);
            System.out.println("WYSZŁO!");
          }

          if(source.equals(button[i])){
            button[i].setText(""+symbol);
            button[i].setEnabled(false);
          }
        }
        checkResult();
    }
    public void checkResult(){

    String[] ch = new String[9];
    int[] id = new int[9];
    for(int i = 0; i < 9; i++){
      ch[i] = button[i].getText();
      id[i] = i;
    }
    if(ch[0].equals(ch[3]) && ch[3].equals(ch[6]) && ch[0] != ""){
      button[id[0]].setBackground(Color.GREEN);
      button[id[3]].setBackground(Color.GREEN);
      button[id[6]].setBackground(Color.GREEN);
    }
    else if(ch[1].equals(ch[4]) && ch[4].equals(ch[7]) && ch[1] != ""){
        button[id[1]].setBackground(Color.RED);
        button[id[4]].setBackground(Color.RED);
        button[id[7]].setBackground(Color.RED);
     }
    else if(ch[2].equals(ch[5]) && ch[5].equals(ch[8]) && ch[2] != ""){
        button[id[2]].setBackground(Color.GREEN);
        button[id[5]].setBackground(Color.GREEN);
        button[id[8]].setBackground(Color.GREEN);
    }

  
  



}

  
    
}