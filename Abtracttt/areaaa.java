package Abtracttt;
import java.util.*;
abstract class shape{
    abstract void area();
}
class circle extends shape{
    void area(){
        Scanner sb = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int r = sb.nextInt();
        double a1;
        a1 = (3.14 * r * r);
        System.out.println("Area of circle is " + a1);
        
    }
}
class triangle extends shape{
    void area(){
        Scanner sa = new Scanner(System.in);
        System.out.println("Enter the height and base: ");
        int h = sa.nextInt();
        int ba = sa.nextInt();
        double a2;
        a2 = (0.5*h*ba);
        System.out.println("Area of triangle is " + a2);
        
    }
}
class rectangle extends shape{
    void area(){
        Scanner sl = new Scanner(System.in);
        System.out.println("Enter the length and breadth: ");
        int br = sl.nextInt();
        int le=sl.nextInt();
        double a3;
        a3 = le*br;
        System.out.println("Area of rectangle is " + a3);
       
    }
}
public class areaaa {
    public static void main(String args[])throws Exception{
        shape obj1= new circle();
        obj1.area();

        shape obj2= new triangle();
        obj2.area();

        shape obj3= new rectangle();
        obj3.area();

    }
    
}
