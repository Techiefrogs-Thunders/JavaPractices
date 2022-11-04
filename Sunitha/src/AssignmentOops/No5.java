package AssignmentOops;
public class No5 {

    public static void main(String[] args) {
       //Rechangle er=new Rechangle(4, 5, 6,8);
        Rechangle re=new Rechangle(5, 8,7,9);
       // int result=er.rectArea();
       int result1=re.areaRect();
       re.areaRect();
        System.out.println(result1);

    }
}
class Rechangle {
    int a,b,c,d;

Rechangle(int e,int f,int g,int h){
    a=e; b=f; c=g; d=h;

}   
public int areaRect() {
    return a*b*c*d;
} 
// public int rectArea() {
//    // return 2*areaRect();
//    return c*d;
//     //System.out.println();

}