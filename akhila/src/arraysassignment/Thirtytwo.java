package arraysassignment;

public class Thirtytwo {
    public static void main(String[] args) {
        int arr1[][]={{3,8},{2,9},{2,5,7}};
        int arr2[][]={{3,8},{2,9},{2,3,5}};
        int c[][]=new int[3][];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                c[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<c[i].length;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
