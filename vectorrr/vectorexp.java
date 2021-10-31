package vectorrr;
import java.io.*;
import java.util.*;

public class vectorexp {
    public static void main(String args[]) throws Exception{
        Vector<String> vec = new Vector <>();
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        int count = 1;
        int fu;
        String name;
        for ( int i = 0; ; i++){
            System.out.println("Add: 1\nDelete: 2\nDisplay: 3");
            fu = Integer.parseInt(br.readLine());
            if(fu == 1){
                System.out.println("Enter Name:");
                name = br.readLine();
                if(vec.contains("Tiger")){
                    System.out.println(name + " is already present");
                    break;
                }
                else{
                    vec.add(name);
                }
                
            }
            else if(fu == 2){
                System.out.println(vec.lastElement());
                vec.remove(vec.lastElement());
            }
            else if (fu == 3){
                for(Object n: vec){
                    System.out.print(n + " ");
                    
                }
                System.exit(0);
            }  
            else{
                System.out.println("Invalid");
            } 
        }
    }

}
