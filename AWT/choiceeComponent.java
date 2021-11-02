import java.awt.*;
public class choiceeComponent extends Frame {
    
    choiceeComponent(){
    Frame f = new Frame();

    Label l1 = new Label("Your favourite Sport: ");
    f.add(l1);
    Choice c = new Choice();

    c.setBounds(100,100,75,75);

    c.add("Tennis");
    c.add("Cricket");
    c.add("Football");
    c.add("Formula 1");


    f.add(c);

    f.setSize(400,400);
    f.setLayout(new FlowLayout());
    f.setVisible(true);
    }


    public static void main(String args[]) throws Exception{

        new choiceeComponent();

    }
    
}
