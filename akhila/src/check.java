public class check {
    int a=8;
    char ch='A';
    void oddoreven()
    {
        if(a%2==0)
        {
            System.out.println(a+" is even ");
        }
        else{
            System.out.println(a+" is odd ");
        }
    }
    void vowels()
    {
        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.println(ch +" is vowel");
        }
        else
        {
            System.out.println(ch+" is consonant");
        }
    }
    void alphabet()
    {
        if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z')
        {
            System.out.println(ch+" is an alphabet");
        }
        else{
            System.out.println(ch+" is not an alphabet");
        }
    }
    void displaychar()
    {
        char ch;
        for(ch='A';ch<='Z';++ch)
        {
            System.out.print(ch+" ");
        }
    }
    public static void main(String[] args) {
        new check().oddoreven();
        new check().vowels();
        new check().alphabet();
        new check().displaychar();
    }
    
}
