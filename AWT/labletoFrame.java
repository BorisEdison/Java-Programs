import java.awt.*;

public class labletoFrame extends Frame  {

    public static void main(String args[]){

        Frame f = new Frame("Program to display the label");

        f.setSize(400,200);
        f.setLayout(new FlowLayout());
        f.setVisible(true);

        Label l1 = new Label("OK");

        Label l2 = new Label("CANCEL");
        f.add(l1);
        f.add(l2);
    }
    
}
