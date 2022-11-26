package stringsassignment;

public class Swapwithoutemp {
    public static void main(String[] args) {
        String s1="akhila ";
        String s2="kakarla";
        System.out.println("Strings before swapping are "+s1+" and "+s2);
        s1=s1+s2;
        s2=s1.substring(0,s1.length()-s2.length());
        s1=s1.substring(s2.length());
        System.out.println("Strings after swapping are "+s1+" and "+s2);
    }
}
