public class numformatEx {
    public static void main(String args[]){
        try {
            String s = "abc";
            int i = Integer.parseInt(s); // NumberFormmatException

        }
        catch(NumberFormatException e){
            System.out.println("Exception is handled"); 
        }
    }
    
}
