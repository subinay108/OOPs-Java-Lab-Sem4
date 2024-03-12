// WAP in Java to find area of a rectangle and square with the concept of method overloading

public class Program14 {

    public static void main(String args[]){
        UserInput ui = new UserInput();
        
        // Taking user input for rectangle
        double length = Double.parseDouble(ui.input("Enter the length of rectangle: "));
        double breadth = Double.parseDouble(ui.input("Enter the breadth of rectangle: "));
        
        // Taking user input for square
        double side = Double.parseDouble(ui.input("Enter the side of square: "));
        
        System.out.println("Rectangle area: " + calculateArea(length, breadth));
        System.out.println("Square are: " + calculateArea(side));
    }
    public static double calculateArea(double length, double breadth){
        return length * breadth;
    }
    public static double calculateArea(double side){
        return side * side;
    }

}
