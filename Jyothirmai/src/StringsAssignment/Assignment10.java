package StringsAssignment;

public class Assignment10 {
    public static void main(String[] args) {
        String str = new String("welcome to java programming");
        String str1 = new String("welcome to java programming");
        int result = str.indexOf(str1, 0);
        if(result == -1){
            System.out.println(str1+" is not present in string");
        }
        else{
            System.out.println(str1+" is present in string");
        }
    }
}
