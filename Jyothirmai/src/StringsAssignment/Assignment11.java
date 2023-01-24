package StringsAssignment;

public class Assignment11 {
    public static void main(String[] args) {
        String str = "hello java programming.how was your work going on?";
        int vcount = 0;
        int ccount = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)=='a'|| str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                vcount++;
                System.out.println("num of vowels: "+vcount);
            }
            //else if(str.charAt(i)>=a&&str.charAt)
        }
        //System.out.println("num of punchuations in a string: "+count);
    }
}
