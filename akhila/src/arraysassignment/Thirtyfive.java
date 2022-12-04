package arraysassignment;

public class Thirtyfive {
    public static void main(String[] args) {
        double[] numArray={2,8,3,7,4,6,5};
        double sd=0.0;
        double sum=0.0;
        for(double num:numArray){
            sum+=num;
        }
        double mean=sum/numArray.length;
        for(double num:numArray){
            sd+=Math.pow(num-mean,2);
        }
        System.out.println("Standard Deviation = "+sd);
    }
}
