package polymorphism;

class Motorbike{
    void run(){
        System.out.println("running");
    }
}
class Splendor extends Motorbike{
    void run(){
        System.out.println("Running safely with 60km");
    }
}

public class motor {
    public static void main(String args[]){
        
        Motorbike b = new Splendor();     //upcasting
        b.run();
    }    
}
