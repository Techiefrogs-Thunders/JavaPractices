package pack1;

public class SubClass extends ParentClass {
    int i = 30;
    void newDisplay(){
        System.out.println("in child class");
    }
    public static void main(String[] args) {
        SubClass subobj = new SubClass();
        subobj.display();
        subobj.newDisplay();
        subobj.AllDisplay();
        System.out.println(subobj.a+"  "+subobj.l+"  "+subobj.name);

    }
}
