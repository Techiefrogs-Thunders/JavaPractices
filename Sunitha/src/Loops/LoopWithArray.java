package Loops;

import java.util.Arrays;

public class LoopWithArray {
public static void main(String[] args) {
    int arr[]={56,7,19,78,556,34,67};
    System.out.println("original array order"); 
   for(int i:arr){
       System.out.print(" "+i);
}   
System.out.println();
System.out.println("sorted in ascending order");
//sortArray(arr, arr.length);  (not understand this)
Arrays.sort(arr); 
for(int i=0; i<arr.length; i++)

{
    System.out.print(" "+arr[i]);

}

}
}