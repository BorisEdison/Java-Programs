
class hi2 implements Runnable{
    public void run(){
        for ( int i =1; i <= 5;i++){
            System.out.println("Hi " + Thread.currentThread().getPriority());
            try{Thread.sleep(1000);}
            catch(Exception e){};
        }
    }
}
class hello2 implements Runnable{
    public void run(){
        for ( int i=1; i<=5 ; i++){
            System.out.println("Hello");
            try{Thread.sleep(1000);}
            catch(Exception e){};
        }
    }
}
public class statess {
    public static void main(String args[]) throws Exception{
        Runnable obj1 = new hi2();
        Runnable obj2 = new hello2();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        System.out.println(t2.getName());
        System.out.println(t1.getName());
        t1.setName("Hi-Thread");
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        t1.setPriority(10);
        System.out.println(t1.isAlive());
        t1.start();
        try{
            Thread.sleep(10);
        }
        catch(Exception e){};
        t2.start();
        System.out.println(t1.isAlive());
        t1.join();
        t2.join();
        System.out.println("Bye");
        
    }
    
}
