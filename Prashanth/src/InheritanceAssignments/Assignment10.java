package InheritanceAssignments;
import java.util.Scanner;

class Apple{
    int number_of_items;
}
class Banana extends Apple{
    int number_of_items;
    void show()
    {
        System.out.println("Enter Number of Apples :");
        Scanner sc= new Scanner(System.in);
        number_of_items= sc.nextInt();
        System.out.println("Enter Number of Bananas :");
        super.number_of_items= sc.nextInt();
        int i= super.number_of_items;
        System.out.println("Number of Items in Apple : " +number_of_items);
        System.out.println("Number of Items in Banana : " +i);
        sc.close();

    }
    Banana(){
        show();
    }
    
}
public class Assignment10{
    public static void main(String[] args) {
        new Banana();
        
    }
   
    
}

