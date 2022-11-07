package methodsassignment;

 class Degree {
    void getDegree()
    {
        System.out.println("I got a degree");
    }
}
class Undergraduate extends Degree
{
    void getDegree()
    {
        System.out.println("I am an Undergraduate");
    }
}
class Postgraduate extends Degree
{
    void getDegree()
    {
        System.out.println("I am a Post Graduate");
    }
}
public class Answer{
    public static void main(String[] args) {
        Undergraduate UG=new Undergraduate();
        Postgraduate PG=new Postgraduate();
        Degree D=new Degree();
        D.getDegree();
        UG.getDegree();
        PG.getDegree();
    }
}
