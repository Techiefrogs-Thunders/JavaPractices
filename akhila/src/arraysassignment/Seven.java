package arraysassignment;

public class Seven {
    public static void main(String[] args) {
        int[] arr={3,5,6,7,9};
        for(int i=0;i<arr.length;i++){
            if((i+1)%2==0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
}
