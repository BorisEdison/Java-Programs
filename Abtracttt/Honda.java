package Abtracttt;

// In real scenario, implementation is provided by others i.e. unknown by end user
abstract class Bike{
    abstract void brake();
}
public class Honda extends Bike {

    void brake(){
        System.out.println("Stops the vehicle");
    }
    public static void main(String args[]){
        
        Bike obj = new Honda();
        obj.brake();

    }
    
}
