package Inheritance;

class Counter{
    int i;
    Counter(int i){
        this.i=i;
    }
    void increment(){
        for(i=0;i<=3;i++){
            if (i==3) {
                System.out.println("i = " + i);
            }
        }
    }
}

class ChildOfCounter extends Counter{

    ChildOfCounter(int i) {
        super(i);
        //TODO Auto-generated constructor stub
    }
    
}
public class Inheritance7 {
    public static void main(String[] args) {
        ChildOfCounter counter = new ChildOfCounter(0);
        counter.increment();
    }
}
