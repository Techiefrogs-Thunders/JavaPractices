public class Banana extends Apple{

    int number_of_items_of_Banana=10;
    Banana(){
        
    }
    void show() {
        
        System.out.println("Displaying the number_of_items_of_Apple:  "+number_of_items_of_Apple1);
        System.out.println("Displaying the number_of_items_of_Banana:  "+number_of_items_of_Banana);
        
    }
    public static void main(String[] args) {
        Banana obj=new Banana();
        obj.show();
    }
    }