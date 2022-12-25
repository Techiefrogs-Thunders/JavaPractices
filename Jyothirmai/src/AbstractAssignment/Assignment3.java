package AbstractAssignment;

public class Assignment3 {
    public static void main(String[] args) {
        ClassesA obj = new ClassesA(80, 60, 70);
        ClassesB obj1 = new ClassesB(60, 80, 75, 90);
        System.out.println(obj.getPercentage());
        System.out.println(obj1.getPercentage());
    }
}
abstract class Marks{
    abstract double getPercentage();
}
class ClassesA extends Marks{
    float sub1,sub2,sub3;
    ClassesA(float s1,float s2,float s3){
        sub1 = s1;
        sub2 = s2;
        sub3 = s3;

    }
    double getPercentage(){
        return (sub1 + sub2 + sub3)/300.0*100;
    }
}
class ClassesB extends Marks{
    float sub1 , sub2 , sub3 , sub4;
    ClassesB(float s1,float s2,float s3,float s4){
        sub1 = s1;
        sub2 = s2;
        sub3 = s3;
        sub4 = s4;

    }
    double getPercentage(){
        return (sub1 + sub2 + sub3 + sub4)/400.0*100;
    }
}
