package ExceptionAssignment;

public class P16 {
    public static void main(String[] args) {
        SuperP16 s=new SuperP16("Akhila");
        try{
            s.clone();
        }
        catch(CloneNotSupportedException c){
            System.out.println(c);
        }
    }
}
class SuperP16{
    private String name;
    public SuperP16(String name){
        super();
        this.name=name;
    }
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}