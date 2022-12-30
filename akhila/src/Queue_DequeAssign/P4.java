package Queue_DequeAssign;

public class P4 {
    public int firstUniqChar(String s) {
        char[] a = s.toCharArray();
  
  for(int i=0; i<a.length;i++){
   if(s.indexOf(a[i])==s.lastIndexOf(a[i])){return i;}
  }
  return -1;
    }
    public static void main(String[] args) {
        P4 p4=new P4();
        System.out.println(p4.firstUniqChar("Akhila"));
    }
}

