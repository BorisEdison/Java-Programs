package method;
import java.util.Scanner;
class Student{
    
    static void insertrecord(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String fname=sc.nextLine();
        System.out.println("Enter your roll no");
        int rollno =sc.nextInt();
        System.out.println("Enter your marks");;
        int marks=sc.nextInt();
        sc.close();
        displayrecord(fname,rollno,marks);
    }
    static void displayrecord(String fname,int rollno, int marks){
        System.out.println("Your name:" + fname );
        System.out.println("Your Roll no:" + rollno );
        System.out.println("Your Marks:" + marks );
    }

    
}

public class Demo2 {
    public static void main(String args[]){
        Student.insertrecord();

    }
    
}
