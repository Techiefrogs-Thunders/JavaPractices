package stringsassignment;

public class Two {
    public static void main(String[] args) {
        String[] s={"html","python","java","c"};
        for(int i=0;i<3;i++){
            for(int j=i+1;j<4;j++)
            {
                if(s[i].compareTo(s[j])>0){
                String temp=s[i];
                s[i]=s[j];
                s[j]=temp;}
            }
        }
        for(int i=0;i<4;i++)
        {
            System.out.println(s[i]);
        }
    }
}
