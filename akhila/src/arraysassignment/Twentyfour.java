package arraysassignment;

public class Twentyfour {
    public static void main(String[] args) {
        int arr[][]={{0,0,3,0,4},{0,0,4,0,0},{2,0,0,9,0},{4,0,0,0,0,0}};
        int n=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(arr[i][j]!=0){
                    n++;
                }
            }
        }
        int arr2[][]=new int[3][n];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(arr[i][j]!=0){
                    arr2[0][j]=i;
                    arr2[1][j]=j;
                    arr2[2][j]=arr[i][j];
                }
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
