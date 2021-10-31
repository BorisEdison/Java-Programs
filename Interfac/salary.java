package Interface;

interface Employee {
    public static final int baseSal = 8000;    // removing static and final would not make any different cause java compiler implements them by default
    public abstract void displaySal();         // removing abstract keyword "      "......
}

class currentEmployee implements Employee{
    public void displaySal(){
        System.out.println("Salary: " + baseSal);
    }
}

public class salary {
    public static void main(String args[]){
        Employee emp = new currentEmployee();

        emp.displaySal();
    }
    
}
