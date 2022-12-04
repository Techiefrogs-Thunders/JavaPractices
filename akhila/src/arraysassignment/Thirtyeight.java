package arraysassignment;

public class Thirtyeight {
    public static int[][] multiply(int arr1[][],int arr2[][]){
        int c[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=0;
                for(int k=0;k<3;k++){
                    c[i][j]+=arr1[i][j]*arr2[i][j];
                }
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Thirtyeight th=new Thirtyeight();
        int arr1[][]={{1,2,3},{2,3,4},{3,4,5}};
        int arr2[][]={{3,8,1},{2,6,0},{1,0,0}};
        int c[][]=multiply(arr1,arr2);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
