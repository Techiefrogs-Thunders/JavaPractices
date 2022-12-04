package arraysassignment;

public class Twentynine {
    public static void main(String[] args) {
         int arr1[][]={{3,8,9},{4,7,2},{2,7,9}};
         int arr2[][]={{1,9,3},{2,8,3},{3,8,9}};
         int arr3[][]=new int[3][3];
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr3[i][j]=0;
                for(int k=0;k<3;k++){
                    arr3[i][j]+=arr1[i][k]*arr2[k][j];
                }
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
