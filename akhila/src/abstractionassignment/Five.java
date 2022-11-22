package abstractionassignment;

public class Five {
    public static void main(String[] args) {
        Cats c=new Cats();
    Dogs d=new Dogs();
    c.cats();
    d.dogs();
    }
}
abstract class Animals{
    abstract void cats();
    abstract void dogs();
}
class Cats extends Animals{
    
        void cats()
        {
            System.out.println("Cats meow");
        }
        @Override
        void dogs() {
            // TODO Auto-generated method stub
            
        }
    }
     
    

class Dogs extends Animals{
    void dogs()
    {
        System.out.println("Dogs bark");
    }

    @Override
    void cats() {
        // TODO Auto-generated method stub
        
    }

    
}