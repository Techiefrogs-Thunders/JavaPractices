package Interface;

public interface IFastFood {
    void sauces();
    void patty();
    void butter();
    
}

class Sandwich implements IFastFood{
    @Override
    public void sauces() {
        System.out.println("Sandwich is greased with lots of sauces");
    }

    @Override
    public void patty() {
        System.out.println("Sandwich has a unhealthy deep fried patty!!!");
    }

    @Override
    public void butter() {
        System.out.println("Sandwich has lots of butter added to it!!!");
    }

    public static void main(String[] args) {
        Sandwich sw=new Sandwich();
        sw.sauces();
        sw.patty();
        sw.butter();
        System.out.println("So, This Sandwich can be considered as Fast Food");
    }
}
