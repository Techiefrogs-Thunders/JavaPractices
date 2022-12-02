package arraysassignment;

public class Ten {
    public static void main(String[] args) {
        int[] arr={3,9,4,7};
        int small=arr[0];
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            if(arr[i]<small){
                small=arr[i];
            }
        }
        System.out.println(small);
    }
}
