import java.awt.*;
 

// Creating Frame by Extending Frame Class

public class SimpleExample extends Frame{
    SimpleExample(){
        Button b = new Button("Button!!");

        b.setBounds(50,50,50,50);    // setting button position on screen

        add(b);                   // adding button into frame

        setSize(500,300);       //setting Frame width and height

        setTitle("this is my First AWT example");  // Setting title of Frame

        setLayout(new FlowLayout());   //Setting the layout for the FRame

        /* By default frame is not visible so we are setting the visibility to true to make it visible */

        setVisible(true);


    }

    public static void main(String args[]){

        // Creating the instance of Frame
        SimpleExample fr = new SimpleExample();
    }
}