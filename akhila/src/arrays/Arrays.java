package arrays;

import java.util.List;

public class Arrays {
    void meth1()
    {
        
        int arr1[]=new int[5];
        int arr2[]= new int[5];
        int arr3[]={10,20,30};
        
        System.out.println(arr1.length);//provides the size of te array
        System.out.println(arr2.length);
        System.out.println(arr3[2]);
        System.out.println(arr2[arr3.length-1]);
        for(int i=0;i<=arr3.length-1;i++)
        {
            System.out.println(arr3[i]);
        }
    }
        public static void main(String[] args) {
            new Arrays().meth1();
        }
        public static List<Integer> asList(int i, int j, int k, int l, int m, int n) {
            return null;
        }
}
