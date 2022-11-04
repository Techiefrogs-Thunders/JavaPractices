package assignmentsInheritance;

public class AppleBanana {
    public static void main(String[] args) {
        Banana ap=new Banana(99);
        ap.Show();
    }   
}
class Apple{
    int number_of_items=10;
    Apple(int number_of_items){
        this.number_of_items=number_of_items;
    }
    void Show(){
        System.out.println(number_of_items);
//this.Show();
    }
}
class Banana extends Apple{
    int number_of_items;
    
public Banana(int number_of_items){
    super(5); //super always come in first line 
        this.number_of_items=number_of_items;
        
    }
    void Show(){
        System.out.println(number_of_items);
super.Show();

    }
}
