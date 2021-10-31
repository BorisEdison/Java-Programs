package superkeyword;

// Super keyword to invoke parent class Method

class Bird1{
    void sing(){
        System.out.println("Bird Singing....");
    }
}

class Sparrow extends Bird1{
    void eat(){
        System.out.println("Eating grains.....");
    }
    void sing(){
        System.out.println("Singing");
    }
    void work(){
        super.sing();   //
        eat();
    }
}


public class invokeparentclassmethod {
    public static void main(String args[]){
        Sparrow s = new Sparrow();
        s.work();
    }
    
}
