package experiment;

class num implements Runnable{
    
    
    public void run(){
        for( int i = 1 ; i<= 10; i++){
            System.out.println( i );
            try{
                Thread.sleep(500);
            }
            catch(Exception e){
            };
        }
    }
}
class squ implements Runnable{
    public void run(){
        for( int i = 1 ; i<= 10; i++){
            System.out.println(i*i );
            try{
                Thread.sleep(500);
            }
            catch(Exception e){
            };
        }
    }
}

public class squaree {
    public static void main(String args[]) throws Exception{


        Runnable ob1 = new num();
        Runnable ob2 = new squ();
        Thread th1 = new Thread(ob1);
        Thread th2 = new Thread(ob2);
        th1.start();
        th1.join();
        th1.setName("name");

        th2.start();
    }
    
}
