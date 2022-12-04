package arraysassignment;

public class Twentyeight {
    public static void main(String[] args) {
        int m,n;
        int countodd=0;int counteven=0;
        int arr[][]={{3,8,9},{4,6,2},{5,9,1}};
        m=arr.length;
        n=arr[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]%2==0){
                    counteven++;
                }
                else{
                    countodd++;
                }
            }
        }
        System.out.println("The frequency of even numbers is "+counteven);
        System.out.println("The frequency of odd numbers is "+countodd);
    }
}
