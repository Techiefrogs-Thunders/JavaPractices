package OTTCompany;
import java.util.Scanner;

public class OTTCompany {
    public static void main(String[] args) {
        int netflix, prime, hotstar;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Netflix hours:");
        netflix=sc.nextInt();
        System.out.println("Enter Prime hours:");
        prime=sc.nextInt();
        System.out.println("Enter Hotstar hours:");
        hotstar=sc.nextInt();
        int nc = netflix/10, pc=prime/5, hc=hotstar/5;
        if(netflix%10!=0){
            System.out.println("Netflix allows viewing hours in multiples of 10");
        }
        else if(hotstar%5!=0||prime%5!=0){
            System.out.println("Hotstar and Prime allows viewing hours in multiples of 5");
        }
        else{
            System.out.println("Total amount should be paid: Rs."+(nc*10+pc*2+hc*1));
        }
        sc.close();
    }
}
