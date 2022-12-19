package ClassObjectsAssignment;

public class AddDistance {
    int feet;
    int inches;

    AddDistance(int f, int i){
        feet=f;
        inches=i;

    }
    static void adddistance(AddDistance d1,AddDistance d2)
    {
        int sum_of_feet=d1.feet+d2.feet;
        int sum_of_inches=d1.inches+d2.inches;
        System.out.println(sum_of_feet+"  "+sum_of_inches);
    }
    public static void main(String[] args) {
        AddDistance d1=new AddDistance(4, 5);
        AddDistance d2=new AddDistance(6,7);
        adddistance(d1,d2);

    }
}
