package 
public class VariablesAndTypes {
    static int no=345;
    int n=88;
    boolean phon;
   static final int M=45;
    public static void main(String args[]) {
       M=87;
        int pen; // declaration
        pen=20;//initilization (20 call as literal)
      //int pen=12; // Local variable definding (combination Initilization+declaration) always intilize
      System.out.println(pen);  
      System.out.println(M);
    }
    void display(){
      System.out.println(phon); 
  }
    phon=false;
System.out.println(phon);
    
}
}

