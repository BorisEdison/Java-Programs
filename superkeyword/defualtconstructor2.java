package superkeyword;


class A {
    A(){
        System.out.println("Constrcutor A");
    }

    A(int i){
        System.out.println("Constructor A parameter");
    }
}
class N extends A{
    N(){
        System.out.println("Constructor N");
    }
    N(int i){
        super(1);
        System.out.println("Constructor N parameter");
    }

}

public class defualtconstructor2 {
    public static void main(String args[]){
        N obj = new N(5);
    }
    
}
