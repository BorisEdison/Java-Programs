package Stringmethod;

public class buffer1 {
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer("Hello ");

        // Append
        sb.append("Java");  //now original string is changed
        System.out.println(sb);      //prints Hello Java


        // Insert
        sb.insert(1,"Java");      //now original string is changed
        System.out.println(sb);

        // Replace
        sb.replace(1, 3, "Java");
        System.out.println(sb);

        // Delete
        sb.delete(1,3);
        System.out.println(sb);

        // Reverse
        sb.reverse();
        System.out.println(sb);
    }
    
}
