package vectorrr;
import java.util.*;

public class defaultvec2 {
    public static void main(String args[]){
        Vector v = new Vector();

        v.add(1);
        v.add(2);
        v.add("Hello");
        v.add("Dbitians");
        v.add(4);

        System.out.println("Before: " + v);

        v.remove(1); // index type
        v.remove("Hello"); // object type first occurrence will be removed
        System.out.println("after removal: " + v);

    }
    
}
