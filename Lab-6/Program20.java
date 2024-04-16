
public class Program20 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Before appending: " + sb);
        System.out.println("After appending: " + sb.append("World"));
        System.out.println("After inserting indexing at 5: " + sb.insert(5, "Jurassic"));
        int a = 2;
        try{
            a = 4;
        }
    }
}
