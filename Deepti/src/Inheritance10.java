

class Apple{
    int number_of_Items;

    Apple(int number_of_Items){
        this.number_of_Items = number_of_Items;
    }
    void show(){
        System.out.println("Number of Apples: "+ number_of_Items);
    } 
}
class Banana extends Apple{
    int number_of_Items;

    Banana(int number_of_Items) {
        super(15);
        this.number_of_Items = number_of_Items;
    }
    void show(){
        super.show();
        System.out.println("Number of Bananas: "+ number_of_Items);
    }

}
public class Inheritance10 {
    public static void main(String[] args) {
        Banana b = new Banana(10);
        b.show();
    }
}

