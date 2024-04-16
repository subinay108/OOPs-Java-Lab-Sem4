import java.util.Vector;

public class Program23 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        for(int i = 1; i <= 5; i++){
            v.add(i);
        }    
        for(int i = 0; i < v.size(); i++){
            System.out.print(v.get(i) + " ");
        }
    }
}
