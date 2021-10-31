package Experiment4;
public class volumeoverloading {
    int volumeofs;
    public volumeoverloading(int side){ 
        volumeofs = side * side * side;
        System.out.println("Volume of Cube is " + volumeofs );
    }
    public volumeoverloading(int length,int breadth,int height){
        volumeofs = length * breadth * height;
        System.out.println("Volume of Cuboid is " + volumeofs);
    }
    public volumeoverloading(int radius,int height){
        double volumeofs = 4 * 3.14 * radius * height;
        System.out.println("Volume of Cylinder is " + volumeofs);
    }
    public volumeoverloading(double side){
        double volumeofs = side * side * side;
        System.out.println("Volume of Cube is " + volumeofs);
    }
    public static void main(String[] args){

        volumeoverloading volume6 = new volumeoverloading(45);
        volumeoverloading volume1 = new volumeoverloading(30,45,60);
        volumeoverloading volume2 = new volumeoverloading(35,56);
        volumeoverloading volume3 = new volumeoverloading(34.7);

    }
    
}
