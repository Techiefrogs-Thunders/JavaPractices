package Loops;

public class NestedForloop {
public static void main(String[] args) {
    for(int i=1; i<=10; i++){
    for(int j=1; j<=i;j++){
       // System.out.println(i +"*"+j +"="+(i*j));

    // it will complete inside for loop 10times then again go to the forst for loop
          if(i%5==0)
             {
              // System.out.println(i +"*"+j +"="+(i*j));
               System.out.print("* ");
                //System.out.println(i +" == "+j);
             }
      //  System.out.println("after completed the inner for loop:"+i);
        System.out.print(" " );
    }
}
} 
}
