package Assignments;

public class HfPyramid {
    public static void main(String[] args) {
            //HalfPyramid with * , Alphabets and Num

        for(int a=1; a<=6; a++){
            for(int b=1; b<=a; b++){
             System.out.print("*");
               System.out.print(b);
            }
           // System.out.println();
           //System.out.println("&");
           System.out.println();   } 

           //Half Pyramid with Alphabets
           char last='G', intial='A';
           int i, b=last-'A'+1;
           for(i=1; i<=b; ++i){
            for(int j=1; j<=i; ++j){
                System.out.print(intial);
            }
            ++intial;
            System.out.println();

           }
    }
    
}
