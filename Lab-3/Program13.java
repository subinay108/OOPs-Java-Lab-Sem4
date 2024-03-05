// WAP in Java to show constructor overloading

class Rectangle{
    double length, breadth;

    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    // for squares
    Rectangle(double side){
        this.length = side;
        this.breadth = side;
    }

    public double getArea(){
        return length * breadth;
    }
}

public class Program13 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(23, 34);
        Rectangle square = new Rectangle(30);

        System.out.println("Rectangle Area: " + rect.getArea());
        System.out.println("Square Area: " + square.getArea());
    } 
}
