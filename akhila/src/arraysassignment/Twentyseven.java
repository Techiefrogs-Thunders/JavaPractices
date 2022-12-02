package arraysassignment;

public class Twentyseven {
    public static void main(String[] args) {
        int arr[][]={{3,8,9},{2,7,9},{5,4,1}};
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i>j){
                    arr[i][j]=0;
                }
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
