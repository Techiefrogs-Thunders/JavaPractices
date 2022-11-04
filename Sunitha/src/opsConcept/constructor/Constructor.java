package opsConcept.constructor;

public class Constructor {

    public static void main(String[] args) {
        FirstConstructor con=new FirstConstructor(456789);
        FirstConstructor con1=new FirstConstructor("java", 2.2f,7654456);
        System.out.println("testing con");
        System.out.println(con);
        System.out.println(con1);
     // System.out.println(con.nt+" "+con.chrome);
        
    }
  }  
class FirstConstructor() {
int nt;
String st;
float fl;        
    FirstConstructor(int nt){
        nt=nt;
        System.out.println("water");
    }
    FirstConstructor(String chrome, Float driver, int version){
      int nt = version;
        st=chrome;
        f1=driver;
        chrome="chrome constructore";
    }
}

