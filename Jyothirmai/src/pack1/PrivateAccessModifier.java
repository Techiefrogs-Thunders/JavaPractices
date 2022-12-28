package pack1;

public class PrivateAccessModifier {
    public int k = 30;
    int l = 20;

    public void display(){
        System.out.println("In display method");
    }

    public PrivateAccessModifier(){
        System.out.println("In private constructor");
    }

    public static void main(String[] args) {
        //int i = 20;
        PrivateAccessModifier pObj = new PrivateAccessModifier();
        pObj.display();
        System.out.println(pObj.k+"  "+pObj.l);

    }
}
