package AssignmengsMethods;

public class Degree {
    public static void main(String[] args) {
        Degree d=new Degree();
        d.setDegree();
        PostGraduate pg=new PostGraduate();
        UnderGraduation ug=new UnderGraduation();
        pg.education();
        ug.education();
    }
    void setDegree(){
        System.out.println("I got a degree");
    }
}

class PostGraduate extends Degree{
    void education(){
        System.out.println("I completed my postgraduation");
    }
}
class UnderGraduation extends Degree{
    void education(){
        System.out.println("I completed my undergraduation");
    }
}