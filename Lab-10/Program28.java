import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Program28{
    public static void main(String[] args) {
        double a, b;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.print("Enter first number: ");
            a = Double.parseDouble(br.readLine());
            System.out.print("Enter second number: ");
            b = Double.parseDouble(br.readLine());
            System.out.println("a/b = " + a/b);
        }catch(Exception e){
            System.out.println("Something went wrong");
        }
    }
}