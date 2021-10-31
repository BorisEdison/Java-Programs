package experiment;

import java.util.*;
class rann extends Thread {
    public void run(){
        int i = 0;
        Scanner objj = new Scanner(System.in);
        System.out.println("Enter a Number");

        int num = objj.nextInt();
        do{
            if(i!=num){
                System.out.println("Still guessing....");
                i++;
                
            }
            else{
                System.out.println("finally " + num + " guessed!!!");
                break;
            }
        }
        while(true);
    }
}
public class randomm {
    public static void main( String args[]) throws Exception{
        rann t1 = new rann();
        t1.start();
    }
    
}
