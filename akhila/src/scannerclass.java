import java.util.Scanner;
public class scannerclass {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String firstname=sc.next();
    int id=sc.nextInt();
    String clgnm=sc.nextLine();
    System.out.println("This is my name and number");
    System.out.println(firstname);
    System.out.println(id);
    System.out.println(clgnm);
    System.err.println("This is my error msg");
    sc.close();
   } 
}
//next()==>to get the next complete token from the scanner
//nextInt()==>it is to get int value as input
