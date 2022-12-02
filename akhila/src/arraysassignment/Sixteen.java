package arraysassignment;

public class Sixteen {
    public static void main(String[] args) {
        int[] arr={4,8,9,2,7};
        int temp=0;
        for(int i=0;i<arr.length;i++){
            {
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]>arr[j]){
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        /* 
        System.out.println("3rd largest number is ");
        System.out.println(arr[(arr.length)-3]);
        */
        /*
        System.out.println("2nd largest number is ");
        System.out.println(arr[(arr.length)-2]);
        */
        
        System.out.println("2nd smallest number is ");
        System.out.println(arr[2]);
        
    }
}
