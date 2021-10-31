package finalkeyword;
public class Bike {
    
    final int speedlimit = 90;         // final variable
    
    void run(){
        speedlimit =40;        // final variable can be assigned only once
    }

    public static void main(String args[]){
        Bike obj = new Bike();
        obj.run();
    }
}
