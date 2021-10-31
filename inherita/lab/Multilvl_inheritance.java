package inheritance.lab;
import java.util.*;
class person{
    int ID;
    String name;
    public void essntl_dtl(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Employee ID : ");
        ID=sc.nextInt();
        sc.nextLine();
        System.out.print("\nEnter Employee ID : ");
        name=sc.nextLine();
    }
}
class Employee extends person{
    String Department;
    int salary;
    public void dpt_dtl(){
        Scanner sn = new Scanner(System.in);
        System.out.print("\nEnter your Department : ");
        Department=sn.nextLine();
        System.out.print("\nEnter your Salary : ");
        salary=sn.nextInt();
    }
}
class Teacher extends Employee{
    String subject;
    Scanner sa = new Scanner(System.in);
    public void subj(){

        System.out.print("\nEnter your Subject : ");
        subject=sa.nextLine();
    }
}
public class Multilvl_inheritance {
    
    public static void main(String[] args) {
        Teacher Tchr = new Teacher();
        
        Tchr.essntl_dtl();
        Tchr.dpt_dtl();
        Tchr.subj();
    }
}
