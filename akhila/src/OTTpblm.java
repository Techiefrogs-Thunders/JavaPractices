import java.util.*;
public class OTTpblm {
    public static int Netflix(){
        int Netflixprice=10;
        int Netflixunithrs=10;
        int Netflixret;
        int result=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Viewing hours for Netflix: ");
        int Netflixviewing=sc.nextInt();
        System.out.println();
        if(Netflixviewing%10!=0){
            System.out.println("Netflix allows viewing hours in multiples of 10 only");
        }
        else{
        Netflixret=Netflixviewing/Netflixunithrs;
        result=Netflixprice*Netflixret;
        }
        return result;
    }
    public static int Amazon(){
        int Amazonprice=2;
        int Amazonunithrs=5;
        int Amazonret;
        int res=0;
        System.out.print("Viewing hours for Amazon Prime: ");
        Scanner sc=new Scanner(System.in);
        int Amazonviewing=sc.nextInt();
        System.out.println();
        if(Amazonviewing%5!=0){
            System.out.println("Amazon Prime allows viewing hours in multiple of 5 only");
        }
        else{
        Amazonret=Amazonviewing/Amazonunithrs;
        res=Amazonprice*Amazonret;
        }
        return res;
    }
    public static int Hotstar(){
        int Hotstarprice=1;
        int Hotstarunithrs=5;
        System.out.print("Viewing hours for Hotstar: ");
        Scanner sc=new Scanner(System.in);
        int Hotstarviewing=sc.nextInt();
        System.out.println();
        int ret;
        int Result=0;
        if(Hotstarviewing%5!=0){
            System.out.println("Hotstar allows viewing hours in multiples of 5 only");
        }
        else{
        ret=Hotstarviewing/Hotstarunithrs;
        Result=Hotstarprice*ret;
        }
        return Result;
    }
    public static void main(String[] args) {
        int res=Netflix();
        int result=Amazon();  
        int Result=Hotstar();
    System.out.println("Total amount should be paid: "+(result+res+Result));
        
    }
    
}


