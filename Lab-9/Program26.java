// WAP in Java for interface to calculate the area and perimeter of a square

interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

class Square implements Shape{
    double side;
    Square(double side){
        this.side = side;
    }
    public double calculateArea(){
        return side * side;
    }
    public double calculatePerimeter(){
        return 4 * side;
    }
}


public class Program26 {
    public static void main(String[] args) {
        Square s = new Square(5);
        System.out.println(s.calculateArea());
        System.out.println(s.calculatePerimeter());
    }
}
