class A{
    void m(){
        System.out.println("Hello m");

    }
    void n () {
        System.out.println("hello n");

        this.m();      // m();   // same as this.m()
    }
}
public class invokecurrentcclassmethod {
    public static void main(String args[]){
        A a = new A();
        a.n();
    }
    
}
