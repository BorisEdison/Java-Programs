package Experiment4;
public class Areaoverloading {
    int areaofs;
    int length;
    int breath;

    public Areaoverloading(int side){
        areaofs = side * side ;
        System.out.println("Area of Square is " + areaofs); 
    }
    public Areaoverloading(double side){
        double areaofs = side * side;
        System.out.println("Area of Square is " + areaofs);
    }
    public Areaoverloading(int length,int breadth){
        int areaofs = length * breadth;
        System.out.println("Area of Rectangle " + areaofs);
    }
    public static void main(String[] args){
        Areaoverloading area = new Areaoverloading(23);
        Areaoverloading area1 = new Areaoverloading(25.4);
        Areaoverloading area2 = new Areaoverloading(24,54);


    }
    
}
