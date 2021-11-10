import java.awt.BorderLayout;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class chatapp  {
    chatapp(){
        JFrame f = new JFrame("Chat Application");
        f.setSize(400,400);
        f.setVisible(true);
        JMenuBar mb = new JMenuBar();
        f.add(mb);
        JMenu m1 = new JMenu("File");
        JMenu m2 = new JMenu("Help");
        mb.add(m1);
        mb.add(m2);


        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m12 = new JMenuItem("Save as");

        m1.add(m11);
        m1.add(m12);

        JPanel p = new JPanel();
        JLabel l = new JLabel("Enter text");
        JTextField tf = new JTextField(10);
        JButton b1 = new JButton("Submit");
        JTextArea ta = new JTextArea();
        JButton b2 = new JButton("Reset");
        f.add(p);
        p.add(l);
        p.add(tf);
        p.add(b1);
        p.add(b2);

        b1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    ta.setText(tf.getText());
                    tf.setText("");
                }
        });

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("");
                
            }
    });



        f.getContentPane().add(BorderLayout.NORTH,mb);

        f.getContentPane().add(BorderLayout.SOUTH,p);
        f.getContentPane().add(BorderLayout.CENTER,ta);


    }
    public static void main(String args[]){
        new chatapp();
    }
    
}
