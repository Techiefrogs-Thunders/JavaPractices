package assignments;

public class swapping {
    public static void main(String[] args) {
    int n1=10, n2=20;

    System.out.println("Before swapping N1: "+n1      +"Before swapping N2:  "+n2);

    n1 = n1+n2;
    //n1=10+20=30
    //n1=30;
    n2 = n1-n2;
    //n2=30-20=10
    n1 = n1-n2;
    //n1=30-10=20

    System.out.println("After swapping N1: "+n1        +"After swapping N2: "+n2);
 
        }
    }

    

