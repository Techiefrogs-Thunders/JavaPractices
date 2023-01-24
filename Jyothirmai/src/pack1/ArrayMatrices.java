package pack1;

public class ArrayMatrices {
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int b[][] = {{7,8,9},{10,11,12},{6,8,9}};
        int c[][] = new int[3][3];
        for(int i=0;i<a.length;i++){
            for(int j = 0;j<b.length;j++){
                c[i][j] = 0;
                for(int k = 0;k<3;k++){
                    c[i][j] += a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
            }
        }
    }