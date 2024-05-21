// WAP in Java to show arthmetic and array out of index exception with multiple catch block & finally statement

public class Program29 {
    public static void main(String[] args) {
        int size = 10;
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = i;
        }
        int n = 2;
        boolean success = true;
        int[] temp = arr.clone();
        try{
            success = false;
            for(int i = 0; i < size; i++){
                arr[i] = arr[i] / n;
            }
            success = true;
        }catch(ArithmeticException e){
            success = false;
            System.out.println("ArithmeticException occured");
        }catch(ArrayIndexOutOfBoundsException e){
            success = false;
            System.out.println("ArrayIndexOutOfBoundsException occured");
        }
    }
}
