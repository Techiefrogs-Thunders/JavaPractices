package opsConcept.Inheritance;

public class ChildInharitance extends ParentInheritance {
        private int salary;
        private char band;
        private byte code;
        private double test;
        ChildInharitance ci=new ChildInharitance();
        
     ChildInharitance(double testE){
          System.out.println("this is child class");
          test=testE;
           System.out.println("constructor");
           //double test=22.33;
           //boolean bcheckpassed=true;
     }
     public void employee(){
        System.out.println("this is first method");
}      
     public char emBand(char bandE) {
     band=bandE;
     return bandE;
}
     public int emSalary(int salaryE) {
     salary=salaryE;
           return salaryE;
}
     public byte emCode(byte codeE) {
     code=codeE;
     return code;
}

}

