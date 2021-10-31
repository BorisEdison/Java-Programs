package vectorrr;

import java.util.Vector;

public class intvector {
    public static void main(String args[]){
        int n = 5;

        Vector <Integer> v = new Vector <Integer>(n);

        for ( int i=1 ; i <= n; i++){
            v.add(i);
            
        }
        System.out.println(v);
        v.remove(3);

        System.out.println(v);

        // Printing elements one by one

        for ( int i = 0; i<v.size(); i++){
            System.out.println(v.get(i) + " ");

        }

        // replacing elements

        v.set(3,21);
        v.set(0,11);
        System.out.println(v);
    }
    
}
