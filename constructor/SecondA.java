package constructor;

public class SecondA {
    int x = 10;
    public static void main(String[] args){
        SecondA obj1= new SecondA();
        SecondA obj2= new SecondA();
        obj1.x=24;
        System.out.println(obj1.x);
        System.out.println(obj2.x);
    }
    
}
