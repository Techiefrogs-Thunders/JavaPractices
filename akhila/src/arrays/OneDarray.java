package arrays;

public class OneDarray {
    
        int arr1[]={2,4,6,5,8};
        int arr2[]={3,5,1,6,7};
        int sum[]=new int[5];
        
        int add1=0;
        int add2=0;
        int i;
        void array1()
    {
        for(i=0;i<arr1.length;i++)
        {
            sum[i]=arr1[i]+arr2[i];
            System.out.print(sum[i]+" ");
        }
        
        System.out.println();
        
    }
    void array2()
    {
        for(i=0;i<arr1.length;i++)
        {
            add1=add1+arr1[i];
            add2=add2+arr2[i];   
        }
        System.out.println(add1+" ");
        System.out.println(add2+" ");        
    }
    public static void main(String[] args) {
        OneDarray one=new OneDarray();
        one.array1();
        one.array2();
    }
}
