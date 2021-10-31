import java.util.*;
interface sports{
    int sports_marks = 5;
}

class student implements sports{
    void Name(String nam){
        String name=nam;
        System.out.println("Name: " + name);
    }
    void ID(String i){
        String id = i;

        System.out.println("ID: " + id);

    }
}

class result extends student{
    int yes;
    void mark1(int su1){
        int sub1 = su1;
        
        Scanner oj = new Scanner(System.in);
        System.out.println("If you take part in sports press 1 else 0 ");
        yes = oj.nextInt();
        if(yes == 1){
            sub1 = sub1 + sports_marks;
        }
        System.out.println("Updated Sub1 marks: " + sub1);
    }
    void mark2(int su2){
        int sub2 = su2;
        if(yes == 1){
            sub2 = sub2 + sports_marks;
        }
        System.out.println("Updated Sub2 marks: " + sub2);

    }
}


public class stu {
    public static void main(String args[]){
 
        student stu1 = new student();
        stu1.Name("Boris");
        stu1.ID("ST0014");
        result mak1 = new result();
        int m1,m2;
        Scanner cc = new Scanner(System.in);
        System.out.println("Enter Subject1 marks: ");
        m1 = cc.nextInt();
        System.out.println("Enter Subject2 marks: ");
        m2 = cc.nextInt();

        mak1.mark1(m1);
        mak1.mark2(m2);




    }
}
