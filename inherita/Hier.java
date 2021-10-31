class Animal {
    void eat(){
        System.out.print("Eating...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Barking...");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("Meowing...");
    }
}
public class Hier {
    public static void main(String args[]){
        Cat c = new Cat();
        c.meow();
        c.eat();
        //c.bark(); //Compile time error
    }
    
}
