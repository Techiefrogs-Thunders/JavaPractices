package HashMapassign;

public class P13 {
    static void getMissingNumbers(int arr[], int N)
    {
       
        // traverse the array arr[]
        for (int i = 0; i < N; i++)
        {
           
            // Update
            arr[Math.abs(arr[i]) - 1]
                = -(Math.abs(arr[Math.abs(arr[i]) - 1]));
        }
       
        // Traverse the array arr[]
        for (int i = 0; i < N; i++)
        {
           
            // If Num is not present
            if (arr[i] > 0)
                System.out.print(i + 1 + " ");
        }
    }
 
 
    public static void main(String[] args) {
        int N = 5;
        int arr[] = { 5, 5, 4, 4, 2 };
         getMissingNumbers(arr, N);
        
    }
}
