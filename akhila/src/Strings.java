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
        StringBuilder a1=new StringBuilder("Hello");
        StringBuilder b1=new StringBuilder("World");
        StringBuilder c1=a1.append(b1);
        String d=String.format("%s%s",a,b);
        String e=String.join("",a,b);
        Strings str=new Strings();
        str.stringtraverse();
        System.out.println(e.toString());
        System.out.println(d.toString());
        System.out.println(c1.toString());
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
        System.out.println(a+" "+" "+b);
        System.out.println();
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
//+ : concatenation
//append() : adds strings
//toString(): returns the string representation of the object
//format() : to concatenate multiple strings using foemat specifier like "%s" followed by values or objects
//String.join("",a,b): a separator is specified inside quotation followed by string objects or array of string objects

