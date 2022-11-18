package Methods;

public class Methods7 {

    int i;

    void printNum(){
        System.out.println(i);
    }
  
}

class SubClass1 extends Methods7{
    int j;

    void printNum(){
        System.out.println(j);
    }
    public static void main(String[] args) {
        
        SubClass1 rj = new SubClass1();
        rj.i = 10;
        rj.j = 20;
        rj.printNum();
        
    }
}
