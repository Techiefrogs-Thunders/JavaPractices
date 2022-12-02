package arraysassignment;

public class Twentythree {
    public static void main(String[] args) {
        int arr[][]={{1,0,0},{0,1,0},{0,0,1}};
        int rows,columns;
        boolean flag=true;
        rows=arr.length;
        columns=arr[0].length;
        if(rows!=columns){
            System.out.println("Matrix should be a square matrix");
        }
        else{
            for(int i=0;i<rows;i++){
                for(int j=0;j<columns;j++){
                    if(i==j &&arr[i][j]!=1){
                        flag=false;
                        break;
                    }
                    if(i!=j&&arr[i][j]!=0){
                        flag=false;
                        break;
                    }
                }
            }
            if(flag){
                System.out.println("Given matrix is an identity matrix");
            }
            else{
                System.out.println("Given matrix is not an identity matrix");
            }
        }
    }
}
