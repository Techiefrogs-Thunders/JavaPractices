package arraysassignment;

public class Fortyone {
    public static void main(String[] args) {
        int a[]={2,3,4};
        int b[]={5,6,7};
        int alength=a.length;
        int blength=b.length;
        int res[]=new int[alength+blength];
        System.arraycopy(a, 0, res, 0, alength);
        System.arraycopy(b, 0, res, alength, blength);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }
}
