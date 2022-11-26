package stringsassignment;

public class Stringrotation {
    public static void main(String[] args) {
        String str1="akhila";
        String str2="badaki";
        if(str1.length()!=str2.length()){
            System.out.println("str2 is not a rotation of str1");
        }
        else{
            str1=str1.concat(str1);
            if(str1.indexOf(str2)!=-1){
                System.out.println("str2 is a rotation of str1");
            }
            else{
                System.out.println("str2 is not a rotation of str1");
            }
        }
    }
}
