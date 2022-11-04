package AssignmengsMethods;

public class InteChar {
    int a;
    char c;
    public static void main(String[] args) {
        InteChar in=new InteChar();
        in.integerName(333333, 'A');
        in.integerName();
        in.integerName('B', 44444);
        System.out.print("End");
        
    }
    void integerName(){
        System.out.println("printing numbers");
    }
    void integerName(int a, char c){
        System.out.println(a+" + "+c +"="+a+c);
        System.out.println(a+c);
    }
    void integerName(char c, int a){
        System.out.println(c+" + "+a +"="+ c+a);
        System.out.println(c+a);
    }
    
}
