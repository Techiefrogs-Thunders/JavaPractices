package ClassObjectsAssignment;

public class Rectangle {
    int length;
    int breath;
    Rectangle(int l,int b){
        this.length = l;
        this.breath = b;
        System.out.println(l*b);
    }
    int area(){
        return length*breath;
    }
    public static void main(String[] args) {
        new Rectangle(4,5);
        new Rectangle(5,8);
 
  }
}
