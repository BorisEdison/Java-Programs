import java.util.Scanner;


 class rect{
    static void accept(){
        int length;
        int breadth;
        
        
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the length:");
        length=in.nextInt();
        System.out.println("Enter the breadth:");
        breadth=in.nextInt();
        compute(length,breadth);
        }
     static void compute(int length,int breadth){
        double area;
         area=length*breadth;
        display(length,breadth,area);
        }
     static void display(int length,int breadth,double area){
        System.out.println("Length of rectangle:"+length);
        System.out.println("Breadth of rectangle:"+breadth);
        System.out.println("Area of rectangle:"+area);
        }
 }
 
  class hello{
    public static void main(String args[]){
       rect.accept();

    
    }

}
