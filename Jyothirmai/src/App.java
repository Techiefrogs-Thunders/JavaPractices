public class App {
    int data;
    static int mydata = 100;
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //System.out.println( 10 + 20);
        //int data = 10 + 20;
        int data;// declration
        data = 50;// initialization
        int data1 = 100; //defining(declaration and initialization)

        System.out.println(data);
        System.out.println(data1);
        App a = new App();
        App obj = new App();
        a.display();
        a.data = 200;
        a.mydata = 700;
        System.out.println(App.mydata);
        obj.data = 500;
        obj.mydata = 300;
        System.out.println(a.data +" "+data);
        //App.mydata = 200;
        System.out.println(App.mydata);
    }
    void display(){
        int data = 10;
        System.out.println(data);
        App.mydata = 400;
        System.out.println("static value = "+App.mydata);
        System.out.println();
    }
}