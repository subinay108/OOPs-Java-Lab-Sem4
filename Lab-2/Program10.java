import java.util.Scanner;

public class Program10 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int n = s.nextInt();
        int count = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
        s.close();
    }    
}
