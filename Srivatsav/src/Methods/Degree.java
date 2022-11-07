package Methods;

public class Degree {

    void getDegree(){
        System.out.println("I got a Degree!!!");
    }
    
}

class PostGraduate extends Degree{
    @Override
    void getDegree() {
        super.getDegree();
        System.out.println("I am a Post Graduate!!!");
    }
}

class UndreGraduate extends Degree{
    @Override
    void getDegree() {
        super.getDegree();
        System.out.println("I am an Under Graduate!!!");
    }
}

class Final{
    public static void main(String[] args) {
        PostGraduate pg = new PostGraduate();
        pg.getDegree();
        System.out.println("*************");
        UndreGraduate ug = new UndreGraduate();
        ug.getDegree();
        System.out.println("*************");
        Degree degree = new Degree();
        degree.getDegree();
    }
}