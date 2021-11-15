import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Bcolor extends JFrame implements ActionListener{
    JFrame frame;
    JPanel panel;
    JButton b1,b2,b3,b4;

    Bcolor(){
        frame = new JFrame("Changing BG Color Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setSize(100,50);

        b1 = new JButton("Blue");
        b1.addActionListener(this);

        b2 = new JButton("Red");
        b2.addActionListener(this);

        b3 = new JButton("Green");
        b3.addActionListener(this);

        b4 = new JButton("Yellow");
        b4.addActionListener(this);

        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        frame.add(panel);

        frame.setSize(100,50);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true); 
        
    }
    public void actionPerformed(ActionEvent e){
        Object obj = e.getSource();
        if(obj==(b1)){
            frame.getContentPane().setBackground(Color.BLUE);
        }
        if(obj==(b2)){
            frame.getContentPane().setBackground(Color.RED);
        }
        if(obj==(b3)){
            frame.getContentPane().setBackground(Color.GREEN);
        }
        if(obj==(b4)){
            frame.getContentPane().setBackground(Color.YELLOW);
        }
    }
}
public class bgcolor {
    public static void main(String args[]){
        Bcolor b =  new Bcolor();
    }
    
}
