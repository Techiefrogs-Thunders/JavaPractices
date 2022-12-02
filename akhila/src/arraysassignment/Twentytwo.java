package arraysassignment;

public class Twentytwo {
    public static void main(String[] args) {
        int[] arr1={4,8,9,2,8};
        int[] arr2=new int[5];
        arr2[0]=3;
        arr2[1]=2;
        arr2[2]=4;
        arr2[3]=1;
        arr2[4]=5;
        int sub[]=new int[5];
        for(int i=0;i<5;i++){
            sub[i]=arr1[i]-arr2[i];
        }
        for(int i=0;i<5;i++){
            System.out.print(sub[i]+" ");
        }
        System.out.println();
    }
}
