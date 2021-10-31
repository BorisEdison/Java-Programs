package overidding;


class Parent{
    static void m1(){
        System.out.printf("From Parent " + "Static m1()"); //static methods cannot be overidden
    }

    void m2(){
        System.out.printf("From Parent" + " non Static(instance) m2()");
    }
}

class Child extends Parent{
    static void m1(){
        System.out.println("From Child static m1()");
    }
    
    void m2(){
        System.out.println("From Child non Static(instance) m2() ");
    }
} 
public class staticmethod {
    public static void main(String args[]){
        Parent obj1 = new Child();
        obj1.m1();
        obj1.m2();


    }
}
