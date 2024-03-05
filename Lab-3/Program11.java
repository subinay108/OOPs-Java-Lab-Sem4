// WAP in Java to find the cost of painting a room including roof at Rs. 25 per unit and cost of flooring with marble at Rs 250 per unit

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Room{
    private double length, breadth, height;
    private double paintingCostPerUnit = 25, marbleCostPerUnit = 250;
    Room(double l, double b, double h){
        length = l;
        breadth = b;
        height = h;
    }

    public double getWallArea(){
        return 2 * (length + breadth) * height;
    }
    public double getRoofArea(){
        return length + breadth;
    }
    public double getFloorArea(){
        return length + breadth;
    }
    public double getVolume(){
        return length * breadth * height;
    }

    public double getTotalPaintingCost(){
        double totalArea = getRoofArea() + getWallArea();
        return totalArea * paintingCostPerUnit;
    }

    public double getTotalMarbleCost(){
        double totalArea = getFloorArea();
        return totalArea * marbleCostPerUnit; 
    }

    public void display(){
        System.out.println("Room Details: ");
        System.out.println("Length = " + length);
        System.out.println("Breadth = " + breadth);
        System.out.println("Height = " + height);
    }

}

public class Program11 {
    public static void main(String args[]){
        // Take input as length, breadth and height
        double l = Double.parseDouble(input("Enter length: "));
        double b = Double.parseDouble(input("Enter breadth: "));
        double h = Double.parseDouble(input("Enter height: "));
        

        Room r = new Room(l, b, h);

        r.display();
        System.out.println("Total Painting cost including roof: " + r.getTotalPaintingCost());
        System.out.println("Total marble cost: " + r.getTotalMarbleCost());
    }

    public static String input(String prompt){
        // read one input and return in String
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(prompt);
        String s = "";
        try{
            s = br.readLine();
        }catch(IOException e){
            System.err.println("Error: "+ e.getMessage());
        }
        return s;
    }
}
