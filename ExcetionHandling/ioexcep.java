import java.io.IOException;

import java.io.*;
public class ioexcep {
    public static void main(String args[]){
        int i,j,k=0;
        i = 8;
        try{
            System.out.println("Enter a number");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            j = Integer.parseInt(br.readLine());
            k = i/j;
        }
        catch(Exception e){
            System.out.println("Value of k is " + k);
        }
    }
    
}
