package pack1;

public class Primenum {
    
    public static void main(String[] args) {
        int k= 0,n=0, i=1, j=1;
        while(n<10){
            j=1;
            k = 0;
            while(j<=i){
                if(i%j==0)
                k++;
                j++;
            }
            if(k==2){
            System.out.println(i);
            n++;
            }
            i++;
        }
    }
}
