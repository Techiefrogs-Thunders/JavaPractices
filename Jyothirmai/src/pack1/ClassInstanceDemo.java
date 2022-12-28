package pack1;

public class ClassInstanceDemo {
    int i= 10;
        String str = "Hello";
        public ClassInstanceDemo(){
            System.out.println("Hi i am in constructor");
        }
    public static void main(String[] args) {
        //int a = 20;
        ClassInstanceDemo classObject = new ClassInstanceDemo();
        classObject.str = "Team";
        ClassInstanceDemo cObj1 = new ClassInstanceDemo();
        cObj1.str = "Eagles";
        System.out.println(classObject.i+"  "+classObject.str);
        System.out.println(cObj1.i+"  "+cObj1.str);

    }
}
