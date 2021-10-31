
public class fibonacci{
    public static void main(String args[]){

        int n;
        
        System.out.println("Enter a number");
        int num=Integer.parseInt(args[0]);
        
        int x=0,y;
        int z=1;
        System.out.println(0);
        
        for(int i =1;i<num;i++){
            if(num==1){
                break;
            }
            System.out.println(z);
            y=x;
            x=z;
            z=x+y;
        }

        
    }
}