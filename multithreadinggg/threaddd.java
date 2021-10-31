class hi extends Thread{
    public void run(){
        for( int i = 1 ; i<= 5; i++){
            System.out.println("Hi");
            try{
                Thread.sleep(500);
            }
            catch(Exception e){
            };
        }
    }
}
class Hello extends Thread{
    public void run(){
        for ( int i= 1; i<=5; i++){
            System.out.println("Hello");
            try{Thread.sleep(500);}
            catch(Exception e){};
        }
    }
}
public class threaddd {
    public static void main(String args[]){
        hi obj1 = new hi();
        Hello obj2 = new Hello();
        // obj1.show();
        // obj2.show();
        obj1.start();{
            try{
                Thread.sleep(10);
            }
            catch(Exception e){
                obj2.start();
            }
        }


    }
    
}
