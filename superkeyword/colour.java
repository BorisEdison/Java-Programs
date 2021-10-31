package superkeyword;

// to refer immediate parent class instance variable
class bird {
    String color = "white";
}
class Pigeon extends bird{
    String color = "blue";
    
    void printColor(){
        System.out.println(color);
        System.out.println(super.color);
    }

}
public class colour {
    public static void main(String args[]){
        Pigeon p = new Pigeon();
        p.printColor();
    }
}
