package InheritanceAssignments;

public class Counter {
    public static void main(String[] args) {
        Counters2 count = new Counters2();
        System.out.println(count.increment(3));
        
    }
}
class Counters{
    int i;
    int increment(int i){
        return i;
    }
}
class Counters2 extends Counters{
    void increment(){
        System.out.println(i);
    }

}
