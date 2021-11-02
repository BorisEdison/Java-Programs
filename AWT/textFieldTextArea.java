import java.awt.*;

import javax.swing.plaf.LabelUI;
public class textFieldTextArea extends Frame{

    public static void main(String args[]){
        Frame f = new Frame("Program is to dispaly textfield");

        f.setSize(700,500);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        Label l1 = new Label("Enter your Name: ");
        TextField input =new TextField(10);
        f.add(l1);
        f.add(input);
        
        Label l2 = new Label("Enter your Address: ");

        TextArea input2 = new TextArea(10,10);

        f.add(l2);
        f.add(input2);
    }

    
}
