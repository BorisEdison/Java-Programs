package buffferclass;

import java.io.*;
public class buff {
    public static void main(String args[]) throws Exception {       // checked exception if we don't handle it program wont be complied

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        System.out.println("Enter your name");
        String name = br.readLine();
        System.out.println("Welcome " + name);
    }
}
