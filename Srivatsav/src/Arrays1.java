import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
       String[] cars = new String[]{"BMW","VOLVO","AUDI","TATA","FORD","MAZDA","CHEV","HONDA"};
        //int[] a = new int[]{11,22,33,44,55,66,77,88,99};
        for (int i = 0; i < cars.length; i++) {
            
            System.out.println("Element of index "+ i+":"+cars[i]);
        }
    }
    
}
