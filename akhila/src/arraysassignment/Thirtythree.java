package arraysassignment;

public class Thirtythree {
     public static void main(String[] args) {
        int a[][]={{1,2,3},{2,3},{3,4,5}};
        int b[][]={{9,8},{2,3,1},{2,6,1}};
        int c[][]=new int[3][];
        for(int i=0;i<a[i].length;i++){
            for(int j=0;j<a.length;j++){
                c[i][j]=0;
                for(int k=0;k<a[i].length;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
