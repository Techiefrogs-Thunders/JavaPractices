package arraysassignment;

public class Thirtyfour {
    public static void main(String[] args) {
        int a[]={3,9,1,8,5,8,3,9,0,6};
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        int average=sum/a.length;
        System.out.println("The average "+average);
    }
}
