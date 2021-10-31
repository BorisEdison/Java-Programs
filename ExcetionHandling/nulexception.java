public class nulexception {

    public static void main(String args[]){

        try{
            String s = null;
            System.out.println(s.length());  //Null Pointer Exception
        }catch(Exception e){
            System.out.println("Some Exception " + e);
        }

    }
    
}
