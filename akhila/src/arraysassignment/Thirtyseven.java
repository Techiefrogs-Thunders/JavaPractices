package arraysassignment;

public class Thirtyseven {
    public static void main(String[] args) {
        int a[][]={{2,4,6},{4,1,9}};
        int b[][]={{3,9,8},{1,9,3}};
        int r1=2;
        int c1=3;
        int r2=2;
        int c2=3;
        int c[][]=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                c[i][j]=0;
                for(int k=0;k<c1;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }

        }
        for(int[] row:c){
            for(int column:row){
                System.out.println(column+" ");
            }
            System.out.println();
        }
    }
}
