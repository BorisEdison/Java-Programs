

package Abtracttt;

abstract class B{

    B(){
        System.out.println("bike is created");
    }
    abstract void run();
    void changeGear(){
        System.out.println("gear changed");
    }
}

class H extends B{
    void run(){
        System.out.println("running safely...");
    }
}

public class nonabstract {
    public static void main(String args[]){
        B obj = new H();
        obj.run();
        obj.changeGear();
    }
    
}
