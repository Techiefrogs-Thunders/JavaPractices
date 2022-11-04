package AssignmengsMethods;

public class Integer {
    int i;
    void printNum(){
        System.out.println(i);
    }
    public static void main(String[] args) {
        //Integer in=new Integer();
        //in.printNum();
        Long l=new Long();
        //l.printNum(2222);
        l.j=5555;
        l.i=2222;
        int s=l.j;
        l.j=l.i;
        l.i=s;
        //System.out.println(l.j);
        l.printNum();
    }
    
}

class Long extends Integer{
    int j;
    void printNum(int j){
System.out.println(j);
    }
}
