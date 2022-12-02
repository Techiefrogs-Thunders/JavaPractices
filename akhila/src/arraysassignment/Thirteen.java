package arraysassignment;

public class Thirteen {
    public static void main(String[] args) {
        int[] arr1={5,2,8,3};
        int n=2;
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            int last,j;
            last=arr1[arr1.length-1];
            for(j=arr1.length-1;j>0;j--){
                arr1[j]=arr1[j-1];
            }
            arr1[0]=last;
        }
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
    }
}
