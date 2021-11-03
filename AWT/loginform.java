import java.awt.*;
import java.awt.event.*;

import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;
public class loginform extends Frame implements ActionListener {

    loginform(){                            //by default frames are invisible
        setVisible(true);
        setSize(900,400);
        setLayout(new FlowLayout());     // by default it uses card layout
        setTitle("Login form");
        
        Label l1 = new Label("Username: ");
        l1.setBounds(20,50,30,10);
        TextField tf1 =new TextField(10);
        tf1.setBounds(40,50,30,10);
        add(l1);
        add(tf1);
        
        Label l2 = new Label("password: ");
        l2.setBounds(20,100,30,10);

        TextField tf2 = new TextField();
        tf2.setBounds(40,100,30,10);
        add(l2);
        add(tf2);
        
        Button b = new Button("Login");
        b.setBounds(40,150,30,10);
        add(b);
        setBackground(Color.BLUE);


    }
    public void actionPerformed(ActionEvent e){       // package inside package 
        System.out.println("Successfully logged in"); 
    }
    public static void main(String args[]){
        loginform g = new loginform();
    }
}


