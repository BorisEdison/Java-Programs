package experiment;

import java.util.*;
class rannn extends Thread {
    public void run(){
        int i = 0;
        Scanner objj = new Scanner(System.in);
        System.out.println("Enter a Number");
        Random random = new Random();
        int randominteger = random.nextInt(100);

        int num = objj.nextInt();
        do{
            if(i!=num){
                System.out.println("current guess " + randominteger);
                randominteger = random.nextInt(100);
            }
            else{
                
                break;
            }
        }
        while(randominteger!=num);
        System.out.println("finally " + randominteger + " guessed!!!" );
    }
}
public class randomrandom {
    public static void main( String args[]) throws Exception{
        rannn t1 = new rannn();
        t1.start();
    }
    
}

