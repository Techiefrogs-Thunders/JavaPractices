package arraysassignment;

public class Nine {
    public static void main(String[] args) {
        int[] arr={3,7,9,8};
        int large;
        large=arr[0];
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                large=arr[i];
            }
        }
        System.out.println(large);
    }
}
