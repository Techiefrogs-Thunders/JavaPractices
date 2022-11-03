package Inheritance;

class Parentclass{
    public void parentMethod(){
        System.out.println("This is Parent Class");
    }
}

class Childclass extends Parentclass{
    public void childMethod(){
        System.out.println("This is Child Class");
    }
}
class Inheritance1 {
    public static void main(String[] args) {
        Parentclass p = new Parentclass();
        Childclass c = new Childclass();
        p.parentMethod();
        c.childMethod();
        c.parentMethod();
    }

}
