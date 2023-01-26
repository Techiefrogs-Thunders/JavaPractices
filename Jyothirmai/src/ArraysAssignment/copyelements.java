package ArraysAssignment;

public class copyelements {
    public static void main(String[] args) {
        int arr[] = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int arr1[] = new int[arr.length];
        System.out.println("elements in original array");

        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("elements of new array is");

        for(int i = 0;i<arr.length;i++){
            arr1[i] = arr[i];
            System.out.print(arr1[i]+" ");
        }
    }
}
