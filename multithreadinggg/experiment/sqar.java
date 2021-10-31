package experiment;

class num1 extends Thread{
    public void run(){
        for ( int i =1 ; i<= 10 ; i++  ){
            System.out.println(i);
        }

    }

}
class sq1 extends Thread{
    public void run(){
        for ( int i =1 ; i<= 10 ; i++  ){
            System.out.println(i*i);
        }

    }
}


public class sqar {
    public static void main(String args[]) throws Exception{
        num1 n = new num1();
        sq1 s1 = new sq1();
        n.start();
        n.join();
        
        s1.start();


    }
    
}
