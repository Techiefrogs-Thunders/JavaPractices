package InheritanceAssignments;
class Banana{
    int number_of_items = 10;
    Banana(){
        System.out.println("In banana constructor");
    }
    void show(int number_of_items){
        this.number_of_items=number_of_items;

    }
}
class Apple extends Banana{
    int number_of_items = 45;
    public static void main(String[] args) {
        Banana obj = new Banana();
        Apple obj1 = new Apple();
        System.out.println(obj.number_of_items);
        System.out.println(obj1.number_of_items);
        
    }
}
