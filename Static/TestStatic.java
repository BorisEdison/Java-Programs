package Static;
class student{
    int rollno;
    String name;
    static String college = "DBIT";
    //static method to change the value of static variable
    static void change(){
        college = "DBCL";
    }
    //constructor to initialize the variable
    student(int r, String n){
        rollno = r;
        name = n;
    }
    //method to display values
    void display(){
        System.out.println(rollno+ " " + name + " " +college);
    }
}

public class TestStatic {
    public static void main(String args[]){
        student.change(); //calling change method
        //creating objects
        student s1 = new student(111,"Karan");
        student s2 = new student(222,"Aryan");
        student s3 = new student(333,"Sonu");
        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}
