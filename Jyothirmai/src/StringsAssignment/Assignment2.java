package StringsAssignment;

public class Assignment2 {
    public static void main(String[] args) {
        String[] str = {"hello" ,"java" ,"programming"};
        for(int i = 0;i<2;i++){
            for(int j=i+1;j<3;j++){
                if(str[i].compareTo(str[j])>0){
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.println("in lexicographical order: ");
        for(int i = 0;i<3;i++){
            System.out.println(str[i]);
        }
    }
}
