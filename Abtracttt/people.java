package Abtracttt;


abstract class Person{
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    abstract void display();
    
}

class Teacher extends Person{
    String tid;
    Teacher(String name , int age, String tid){
        super(name,age);
        this.tid = tid;
    }
    
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Teacher: " + tid);
    }
}

class Student extends Person{
    String tid;
    Student(String name , int age, String tid){
        super(name,age);
        this.tid = tid;
    }
    
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Teacher: " + tid);
    }
}
public class people {
    public static void main(String args[]){

        Person obj = new Teacher("Maya", 27, "T348");
        obj.display();

        System.out.println();
        Person obj1 = new Student("John", 18, "S012");
        obj1.display();
    }
    
}
