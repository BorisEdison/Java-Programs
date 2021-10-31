package vectorrr;
import java.util.*;
public class vec3 {
    public static void main(String args[]){

        Vector<String> v = new Vector<String>();
        v.add("We");
        v.add("the");
        v.add("World");
        v.add(1,"are");

        for ( int i = 0; i< v.size(); i++){
            
            System.out.print(v.get(i) + " ");
        }
        System.out.println();
        
        for( String s:v){
            System.out.print(s + " ");
        }
        
    }
    
}
