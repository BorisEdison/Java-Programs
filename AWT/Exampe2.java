import java.awt.*;

public class Exampe2 extends Frame {

    Exampe2(){

        //Creaing Frame
        Frame fr = new Frame();

        Label lb = new Label("UserID:");   //Creating a label

        fr.add(lb);     // adding label to the frame

        TextField t = new TextField();   //Creating Text Field

        fr.add(t);                  // adding text field to the frame

        fr.setSize(500,300);    // Setting frame size

        fr.setLayout(new FlowLayout()); //Setting the layout for the Frame

        fr.setVisible(true);


    }

    public static void main(String args[]){

        Exampe2 ex = new Exampe2();

    }
    
}
