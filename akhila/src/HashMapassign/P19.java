package HashMapassign;
import java.util.*;
public class P19 {
    static class Pair{
        int fre;
        int fi;
        int li;
        Pair(int fre,int fi,int li){
            this.fre=fre;
            this.fi=fi;
            this.li=li;
        }
     }
    static void smallestSubsegment(int arr[], int n)
    {
        // To store left most occurrence of elements
         HashMap<Integer,Pair>hm=new HashMap<>();
 
        int mfi=arr[0];
 
        int mf=1;
 
        int si=0;
 
        int mflen=1;
 
        hm.put(arr[0],new Pair(1,0,0));
 
        for(int i=1;i<arr.length;i++){
 
            int val=arr[i];
 
            if(hm.containsKey(val))
 
            {
 
            Pair p=hm.get(val);
 
            p.fre++;
 
            p.li=i;
 
            int len=i-p.fi+1;
 
            if(p.fre>mf){
 
                mfi=val;
 
                mf=p.fre;
 
                si=p.fi;
 
                mflen=len;
 
            }
 
            else if(p.fre==mf && len<mflen){
 
                mfi=val;
 
                mf=p.fre;
 
                si=p.fi;
 
                mflen=len;
 
            }
 
            else if(p.fre==mf && len==mflen && p.fi<si)
 
            {
 
              mfi=val;
 
                mf=p.fre;
 
                si=p.fi;
 
                mflen=len;  
 
            }
 
            }
 
            else
 
            hm.put(val,new Pair(1,i,i));
 
        }
 
        int en=mflen+si-1;
 
        
     
        for (int i = si; i <=en ; i++)
            System.out.print(arr[i] + " ");
    }
     
    
    public static void main (String[] args)
    {
        int A[] = { 1, 2, 2, 2, 1 };
        int n = A.length;
        smallestSubsegment(A, n);
    }
}
