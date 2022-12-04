package arraysassignment;

public class Thirtysix {
    public static void main(String[] args) {
        int a[][]={{2,3,4},{3,4,5},{4,5,6}};
        int b[][]={{4,3,2},{5,4,3},{6,5,4}};
        int rows=2;
        int columns=3;
        int sum[][]=new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
