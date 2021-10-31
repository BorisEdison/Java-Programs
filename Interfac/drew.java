package Interface;


interface Drawable{
    void draw();
}

class Rectangle implements Drawable{
    public void draw(){
        System.out.println("Drwawing rectangle");
    }
}

class Circle implements Drawable{
    public void draw(){
        System.out.println("Drawing cicle");
    }
}
public class drew {
    public static void main(String args[]){
        Drawable d = new Rectangle();
        d.draw();

        Circle c = new Circle();
        c.draw();

    }
    
}
