package Static;
public class calculate {
    static int cube (int x){
        return x*x*x;
    }
    public static void main(String argsp[]){
        int result = calculate.cube(5);
        System.out.println(result);

    }
    
}
