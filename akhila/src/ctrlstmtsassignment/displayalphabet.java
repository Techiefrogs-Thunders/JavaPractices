package ctrlstmtsassignment;

public class displayalphabet {
    void meth1()
    {
        char ch;
        
        for(ch='a';ch<='z';ch++)
        {
            System.out.print(ch+" ");
        }
    }
    public static void main(String[] args) {
        new displayalphabet().meth1();
    }
}
