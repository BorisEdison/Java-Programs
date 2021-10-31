class student1{
    int rollno;
    String name,course;
    float fee;
    student1( int rollno, String name, String course){
        this.rollno = rollno;
        this.name = name;
        this.course = course;
    }
    student1 (int rollno, String name,String course,float fee){
        this(rollno, name, course);       // reusing constructor
        this.fee = fee;
    }
    void display(){
        System.out.println(rollno + " " + name + " " + course + " " + fee);
    }
}
public class reusingconstructor {

    public static void main(String args[]){
        student1 s1 = new student1(111, "ankit" ,"java");
        student1 s2 = new student ( 112, "sumit", "java", 6000f);
        s1.display();
        s2.display();
    }
}
