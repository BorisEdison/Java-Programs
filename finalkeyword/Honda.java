package finalkeyword;

class bike1{
   
    final void run(){
        System.out.println("running");
    }
}
class Honda1 extends bike1{}

public class Honda {
    public static void main(String args[]){
        Honda1 h = new Honda1();
        h.run();
    }
    
}
