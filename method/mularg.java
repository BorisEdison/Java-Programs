package method;

public class mularg {

    static void name ( String fname){

        System.out.println("Your name is " + fname);


    }
    static void name (String fname,String fname2){
        System.out.println("Your name "+ fname);
        System.out.println("Your friend "+ fname2);

    }

    public static void main(String args[]){
        name("Boris");

        name("Boris","Novak");

    }

    
}
