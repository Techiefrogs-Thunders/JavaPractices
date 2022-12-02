package arraysassignment;

public class One {
    public static void main(String[] args) {
        int arr1[]={1,4,6,8};
        int arr2[]=new int[arr1.length];
        arr2=arr1;
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
    }
}
