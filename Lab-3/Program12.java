// WAP in Java to find the area of floor and volume of a room using a constructor for assigning input values

// This program uses the Room class defined in Program11

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program12 {
    public static void main(String args[]){
        // Take input as length, breadth and height
        double l = Double.parseDouble(input("Enter length: "));
        double b = Double.parseDouble(input("Enter breadth: "));
        double h = Double.parseDouble(input("Enter height: "));
        

        Room r = new Room(l, b, h);

        r.display();
        System.out.println("Area of floor: " + r.getFloorArea());
        System.out.println("Volume of room: " + r.getVolume());
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

