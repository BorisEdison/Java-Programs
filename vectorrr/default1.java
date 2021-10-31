package vectorrr;
import java.util.*;
public class default1 {
    public static void main(String args[]){
        Vector v = new Vector();

        v.add(1);
        v.add(25);
        v.add(12);
        v.add(9);
        v.add(50);
        v.add("Hi");

        System.out.println(v.capacity());
        
        for (Object i:v ){
            System.out.println(i);
        }
    }
    
}
