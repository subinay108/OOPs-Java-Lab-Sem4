// 24. WAP in Java for method overriding (area() of Rectangle and Square class)

class Square{
    double length;
    Square(double l){
        length = l;
    }
    public double area(){
        return length * length; 
    }
}


class Rectangle extends Square{
    double breadth;
    Rectangle(double l, double b){
        super(l);
        breadth = b;
    }
    public double area(){
        return length * breadth;
    }
}


public class Program24 {
    public static void main(String[] args) {
        Square s = new Square(4);
        Rectangle r = new Rectangle(2, 3);
        System.out.println("Square area: " + s.area());
        System.out.println("Rectangle area: " + r.area());
    }    
}
 