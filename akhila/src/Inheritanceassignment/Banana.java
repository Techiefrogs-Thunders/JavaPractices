package Inheritanceassignment;
public class Banana extends Apple{
    int number_of_items=5;
    void show()
    {
        System.out.println(number_of_items);
    }
    public static void main(String[] args) {
        Banana b=new Banana();
        b.show();
        Apple a=new Apple();
        a.show();
    }
}
class Apple
{
    int number_of_items=8;
    void show()
    {
        System.out.println(number_of_items);
    }
}