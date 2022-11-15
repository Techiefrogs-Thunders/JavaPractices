package arrays;

public class TwoDarray {
    void array()
    {
        int arr1[][]={{1,2,3},{7,6,9},{2,5,7}};
        int arr2[][]={{3,4,5},{2,4,6},{3,5,8}};
        System.out.println("arr1[][] is");
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                System.out.print(arr1[i][j]+" ");                
            }
            System.out.println();
        }
        System.out.println("arr2[][] is");
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                System.out.print(arr2[i][j]+" ");                
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        TwoDarray array=new TwoDarray();
        array.array();
    }
     
}
