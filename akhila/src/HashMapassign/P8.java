package HashMapassign;

public class P8 {
    public static void main(String[] args) {
        String s1="listen";
        String s2="silent";
        s1=s1.toLowerCase();
        s2=s2.toLowerCase(); 
        if(s1.length()!=s2.length()){
            System.out.println("false");
        }
        else{
            for(int i=0;i<s1.length();i++){
                for(int j=0;j<s2.length();j++){
                    if(s1.charAt(i)==s2.charAt(j)){
                        s2=s2.substring(0,j)+s2.substring(j+1);
                        break;
                    }
                }
            }
            if(s2.length()==0){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
    }
}
