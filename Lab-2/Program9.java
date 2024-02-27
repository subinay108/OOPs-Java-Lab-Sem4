// WAP in Java to perform arithmetic operations using switch case

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args){
        int choice;
        double a, b;
        Scanner s = new Scanner(System.in);
        boolean running = true;
        while(running){
            System.out.println("1.Add 2.Substract 3.Multiply 4.Divide 5.Remainder 0.Quit");
            System.out.print("Enter Choice: ");
            choice = s.nextInt();
            System.out.print("Enter first number: ");
            a = s.nextDouble();
            
            System.out.print("Enter second number: ");
            b = s.nextDouble();
            switch (choice) {
                case 1:
                    System.out.println(a + " + " + b + " = " + (a + b));
                    break;
                case 2:
                    System.out.println(a + " - " + b + " = " + (a - b));
                    break;
                case 3:
                    System.out.println(a + " * " + b + " = " + (a * b));
                    break;
                case 4:
                    System.out.println(a + " / " + b + " = " + (a / b));
                    break;
                case 5:
                    System.out.println(a + " % " + b + " = " + (a % b));
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Invlid input. Enter again...");
                    break;
            }
        }
    }    
}
