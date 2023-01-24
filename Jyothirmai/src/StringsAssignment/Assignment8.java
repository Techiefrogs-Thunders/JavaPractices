package StringsAssignment;

public class Assignment8 {
    public static void main(String[] args) {
        String str = "welcome to java";
        String firstLetter = str.substring(0,str.length());
        //String remainingletter = str.substring(1, str.length());
        firstLetter = firstLetter.toUpperCase();
        str = firstLetter;
        System.out.println("name is: "+str);
    }
}
