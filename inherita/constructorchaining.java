package inheritance;
class Base{ 
    Base(){          // this construtor will be inherited by Derived as this is default constructor
                        // defualut is the one  in which we don't pass parameters
        System.out.println("Base Class Constructor Called");  
    }
}

class Derived extends Base{
    Derived(){
        System.out.println("Derived Class Constructor Called ");
    }
}
public class constructorchaining {
    public static void mmain (String args[]){
        Derived d = new Derived();
    }
    
}
