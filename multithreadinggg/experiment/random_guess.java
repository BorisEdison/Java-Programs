import java.util.*;
class guess extends Thread{
    public void run(){
        Random random = new Random();
        int randomInteger = random.nextInt(100);
        System.out.println("Random no. generated is "+randomInteger);
        int i=1;
        do{
             if(i==randomInteger){
                System.out.println(i+" is found");
                System.out.println(Thread.currentThread().getName());
                System.exit(1);
            }
            i++;
        }while(true); 
}
}
public class random_guess {
    public static void main(String[] args) {
        guess n =new guess();
        n.start();
        //System.out.println(n.getName()); 
    }
}