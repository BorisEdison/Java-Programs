//Calling parameterized constructor from default constructor

Class A{
    A(){
        this(5);
        System.out.println("hell a");

    }
    A(int x){
        System.out.println(x);
    }
}
public class invokecurrentclassconstructor2 {
    public static void main(String args[]){
        A a = new A();
    }
    
}
