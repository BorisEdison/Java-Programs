package method;
import java.util.Scanner;


class rectangle{

    static void insertrecord(){
        Scanner dimension = new Scanner (System.in);
        System.out.println("Enter the length of the rectangle:");
        int l= dimension.nextInt();
        System.out.println("Enter the breath of the rectangle");
        int b=dimension.nextInt();
        dimension.close();
        display(l,b);
    }
    static void display(int l, int b){
        System.out.println("The length of the rectangle is " + l);
        System.out.println("The breath of the rectangle is " + b);
        System.out.println("The area of the rectangle is " + l*b);

    }
}
public class demo {
    public static void main (String args[]){
        rectangle.insertrecord();

    }
    
    
}
