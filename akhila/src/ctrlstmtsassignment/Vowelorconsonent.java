package ctrlstmtsassignment;

public class Vowelorconsonent {
    char ch='W';
    void meth1()
    {
        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.println(ch+" is vowel");
        }
        else{
            System.out.println(ch+" is consonent");
        }
    }
    public static void main(String[] args) {
        new Vowelorconsonent().meth1();
    }
}
