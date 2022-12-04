package arraysassignment;

public class Thirtyone {
    public static void main(String[] args) {
        int arr[][]={{3,7,2},{1,2,1},{2,7,3}};
        int trans[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                trans[i][j]=arr[j][i];
            }
        }
        System.out.println("matrix before transpose");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("matrix after transpose");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
