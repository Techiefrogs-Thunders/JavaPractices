package AssignmentOops;

public class No7 {
    public static void main(String[] args) {
        returnArea ra=new returnArea(14, 2); 
    } 
}
class returnArea{
    int Lenght1,breath2;
returnArea(int l1,int b2){
    Lenght1 = l1;
    breath2=b2;
    System.out.println(l1+"*"+b2);
    int result=breath2*Lenght1;
    System.out.println("Results: "+result);
}
}