package constructorsassignment;

public class Average {
    void average(int a,int b,int c)
    {
        int average;
        average=(a+b+c)/3;
        System.out.println("Average "+average);
    }
    public static void main(String[] args) {
        new Average().average(20,25,45);
    }
}
