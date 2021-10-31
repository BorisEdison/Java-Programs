
class vehicle{
    void no_of_seats(int s,String v){
        int s1 = s;
        String v1 = v;
        System.out.println("No of seats in a "+v1 + " is " + s1);
    }
    void no_of_wheels(int w,String ve){
        int we = w;
        String v2 = ve;
        System.out.println("No of wheels on a "+ v2 + " is " + we);
    }
}
public class veh {
    public static void main(String args[]){
        
        vehicle car = new vehicle();
        car.no_of_seats(4, "Car");
        car.no_of_wheels(4, "Car");
        System.out.println();
        vehicle Bike = new vehicle();
        Bike.no_of_wheels(2, "Bike");
        Bike.no_of_seats(2, "Bike");
        

    }
    
}
