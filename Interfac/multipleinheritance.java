package Interface;


interface Printable{
    void print();
}

interface Showable{
    void show();
}
class I3 implements Printable,Showable{
    public void print(){
        System.out.println("Hello! this is printable");
        
    }
    public void show(){
        System.out.println("Hello! this is showable");
    }
}
public class multipleinheritance {
    public  static void main(String args[]){

        I3 obj = new I3();
        obj.print();
        obj.show();
    }
    
}
