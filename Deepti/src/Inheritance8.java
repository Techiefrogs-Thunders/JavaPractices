

class ClassA{
    int i, j;
    ClassA(int i,int j){
        this.i=i;
        this.j=j;
    }
    void show(){
        System.out.println("The value of i is: "+i);
        System.out.println("The value of j is: "+j);
    } 
}

class ClassB{
    int k;
    ClassB(int k){
        super();
        this.k = k;   
    }

    void show(){
        System.out.println("The Value of k is: " + k);
    }
}
public class Inheritance8 {
    public static void main(String[] args) {
        ClassB b = new ClassB(90);
        b.show();
    }
}
 
    

