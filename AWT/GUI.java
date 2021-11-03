import java.awt.*;
import java.awt.event.*;
public class GUI extends Frame implements ActionListener {

    GUI(){                            //by default frames are invisible
        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());     // by default it uses card layout

        
        Label l1 = new Label("Hello");

        add(l1);

        Label l2 = new Label("Hello world");
        
        add(l2);

        Button b = new Button("OK");
        add(b);
    }
    public void actionPerformed(ActionEvent e){       // package inside package 
        System.out.println("OK"); 
    }
    public static void main(String args[]){
        GUI g = new GUI();
    }
}


