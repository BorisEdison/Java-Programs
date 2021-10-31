package inheritance.lab;

class Person{
    void id(int i){
        System.out.println("ID: " + i);
    }
    void name(String s){
        System.out.println("Name: " + s);
    }
}
class employee extends Person{
    void department(String d){
        System.out.println("Department: "+ d);
    }
    void salary(int sal){
        System.out.println("Salary: " + sal );
    }
}
class Teacher extends employee{
    void subject(String sub){
        System.out.println("Subject: "+ sub);
    }
}

public class multi {
    public static void main(String args[]){
        Teacher sb = new Teacher();
        sb.name("Boris");
        sb.id(123846);
        sb.department("Education");
        sb.salary(99999);
        sb.subject("Maths");
    }
    
}
