//Java Program to demonstrate the use of an instance variable
//which get memory each time when we create and object of the class
package Static;
public class instancevariable {
    int count = 0; //will get memory each time when the instannce is created
    public  instancevariable(){
        count++; //incrementing variable
        System.out.println(count);
    }
    public static void main(String args[]){
        //creating objects
        instancevariable i1 = new instancevariable();
        instancevariable i2 = new instancevariable();
        instancevariable i3 = new instancevariable();
    }
}
