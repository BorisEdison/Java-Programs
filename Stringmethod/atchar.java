package Stringmethod;

public class atchar {
    public static void main(String args[]){
        String name = "oopjavalab";
        System.out.println(name.length());
        char ch = name.charAt(4);
        System.out.println(ch);


        //Strings are immutable

        String s = "Sachin";
        s=s.concat(" Tendulkar");  //concat() method appends the string at the end
        System.out.println(s);
        
    }
}
