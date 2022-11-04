public class PrimitiveDatasAndTypes {
    static boolean Student;              //default value false(1 bit),
    static  int roleno=845;              //(32-bit two's compliment integer(2-ci),between -2147483648 to -2147483647(4 byte))
    static  char section='H';            //Intger&Character are can interchange and result shows in ASCII
    static  byte age=-12;              //(8 bit signed 2-ci, between -128 to 127 (1byte))
    static  short subCode=+3578;         //(16bit signed 2-ci, between -32768 to 32767 (2byte))
    static  long phoneNo=+919876234598l; //(64bit signed 2-ci, always give L/l after the value(8 byte))
    static  float percentage=87.4f;      //(32 bit single precision, always give f/F after the value(4 byte))
    static  double remarkper=0.9100238;  //(64 bit double precisioncan give N no of decimalsNO(ex:0.8765434567)(8 byte))
    public static void main(String...args) {
        //Student=true;
        roleno=section;
  section='G';
  roleno=section;
        String name="Jay"; 
    System.out.println("is student:"+" "+Student);
    System.out.println("Name:"+" " +name);
    System.out.println("Section:" +PrimitiveDatasAndTypes.section);
    System.out.println("RoleNO:"+" "+roleno);
   System.err.println(section);
    System.out.println("age:"+" " +age);
    System.out.println("SubjectCode:"+" "+subCode);
    System.out.println("Percentage%="+" "+percentage);
    System.out.println("ExtraMark="+" "+remarkper);
        
    }
    void monkey(){
        System.out.println("hello");
    }
    
}
