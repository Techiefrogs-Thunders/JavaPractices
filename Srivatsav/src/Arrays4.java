public class Arrays4 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88 };
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] == 44) {
                System.out.println("Found! Found at Index: " + i);
            }
        }
    }
    
}
