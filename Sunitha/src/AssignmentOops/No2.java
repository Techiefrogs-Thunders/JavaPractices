package AssignmentOops;
public class No2 {
    public static void main(String[] args) {
       // Details student=new Details(23);
        Details student1=new Details("sam",101,8765432,"dallasvelley");
        Details student2=new Details("john",56,7654323,"bsghxxbshxbhaxa");
      //  Details student2=new Details();   
    }
}
class Details{
    byte roll, phoneno;
    String name, address;
Details(){
    System.out.println("class details");
}
Details(int roll){
   roll=roll;
    System.out.println(roll);
}
Details(String name){
    name=name;
    System.out.println(name+"  class details");
}
Details(String name, int roll,int phoneno,String address){
    address=address;
    System.out.println(name +"   "+roll+"   "+phoneno+"   "+address);
}
Details(String name, byte roll,String address, int phoneno){
    System.out.println(name +"   "+roll+"   "+address+"   "+phoneno);
}}
