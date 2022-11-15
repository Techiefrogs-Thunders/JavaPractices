public class Strings
{
    void stringtraverse()
    {
        String s="Akhila kakarla";
        for(int i=0;i<s.length();i++)
        {
            System.out.println(s.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        String a="Akhila";
        String b=new String("akhila");
        String c="  Akhila ";
        Strings str=new Strings();
        str.stringtraverse();
        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a.toUpperCase());
        System.out.println(b.toLowerCase());
        System.out.println(c.trim());
        System.out.println(b.compareTo(a));
        System.out.println(a.concat(" kakarla"));
        System.out.println(a.concat(b).concat(" ").concat(c));
        System.out.println(a.contains("akhi"));
         
    }
}
//length():gives the length of the string
//charAt():returns the character at specified index in a string.
//"==": compares the address of the object
//equals(): compares the values of strings
//equalsIgnoreCase():compares the values irrespective of their cases
//toUpperCase(): all characters in the string displayed in upper case
//toLowerCase(): all characters displayed in lower case
//trim():ignores the spaces at the start and ending of the string
//compareTo(): compares the string(in ASCII values) 
//concat():combines specified string at te end
//contains(): searches for the content in the string
