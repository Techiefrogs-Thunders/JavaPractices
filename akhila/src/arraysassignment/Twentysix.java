package arraysassignment;

public class Twentysix {
    public static void main(String[] args) {
        int arr[][]={{2,5,8},{3,8,6},{4,7,1}};
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i<j){
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
