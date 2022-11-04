package opsConcept.Inheritance;

public class SubInheritance extends ChildInharitance {
    SubInheritance(double testE) {
        super(testE);
        //TODO Auto-generated constructor stub
    }
    private double hike;
    private float hikePer;
    public short devices;
    public boolean bcheckpassed;

    public double emHike(double hikeE) {
        System.out.println("this is 2nd child class");

        hike=hikeE;
        return hike;    
    }
    public float emHikePer(float hikePerE) {
        hikePer=hikePerE;
        return hikePer;   
    }
    public boolean emBackCheck(boolean bcheckpassedE) {
        bcheckpassed=bcheckpassedE;
        return bcheckpassed;
        
    }

}
