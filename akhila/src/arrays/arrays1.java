package arrays;

public class arrays1 {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr1=new int[8];
        int []arr2={1,4,6,8,9};
        //int arr3[]={2,4,5,6,9};
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }//for loop
        for(int i:arr2){
            System.out.println(arr2[i]);
        }//for-each loop
        printArray(new int[]{3,8,9,7,5});
    }
}
