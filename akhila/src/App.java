public class App {
    public static void main(String[] args)  {
        int n=0,ct=0,i=1,j=1;
        while(n<10){
            j=1;
            ct=0;
            while(j<=i){
                if(i%j==0)
                    ct++;
                    j++;
                
            }
            if(ct==2){
                System.out.print(i+" ");
                n++;
            }
            i++;
            
        }
    }
}
