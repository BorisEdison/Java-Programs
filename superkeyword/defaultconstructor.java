package superkeyword;

// super  keyword used to invoke parent class constructor
class X{
    X(){
        System.out.println("Constructor X");
    }
}
class Y extends X{
    Y(){
        System.out.println("Constructor Y");
    }

    Y(int i){
        System.out.println("Consturctor Y parameter");
    }
}
public class defaultconstructor {
    public static void main(String args[]){
        Y obj = new Y(5);
        
    }
    
}
