package arraysassignment;

public class Eight {
    public static void main(String[] args) {
        int[] arr={4,7,9,2};
        for(int i=0;i<arr.length;i++){
            if((i+1)%2!=0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
}
