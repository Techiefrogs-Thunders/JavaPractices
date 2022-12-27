package PriorityqueueAssaugnment;
import java.util.*;
public class P16 {
    static void findRank(int[] A,int n){
        int[] rank=new int[n];
        Queue<Integer> q=new PriorityQueue<Integer>();
        q.add(A[n-1]);
        for(int i=n-2;i>=0;i--){
            if(A[i]<q.peek()){
                q.add(A[i]);
                rank[i]=q.size()-1;
            }
            else{
                while(!q.isEmpty()&& A[i]>=q.peek()){
                    q.poll();
                }
                q.add(A[i]);
                rank[i]=q.size()-1;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(rank[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] A={2,1,3,4,5};
        int n=A.length;
        findRank(A,n);
    }
}
