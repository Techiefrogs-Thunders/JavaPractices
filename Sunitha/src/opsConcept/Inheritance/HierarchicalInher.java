package opsConcept.Inheritance;

public class HierarchicalInher {
 public static void main(String[] args) {
        FirstSon s1=new FirstSon();
        s1.sharePartOne();
       s1.property();
       s1.deposit();
        SecondSon s2=new SecondSon();
        s2.sharePartTwo();
       s2.deposit();       
    }
}
class Father {
    void property(){
        System.out.println("property....++++");
    }
    void deposit() {
        System.out.println("deposits......++++");  
    }
}
class FirstSon extends Father {
 void sharePartOne() {
    System.out.println(" First Sone ---sharePartOne ...");
}   
}
class SecondSon extends Father{
    void sharePartTwo() {
        System.out.println(" Second Son--- sharePartTwoooo....");
    }
}  
//  public static void main(String[] args) {

// 		ComputerDepartment cd = new ComputerDepartment();
// 		cd.learn();
// 		cd.programming();

// 		// Science department
// 		ScienceDepartment sd = new ScienceDepartment();
// 		sd.learn();
// 		sd.physics();
// 		sd.chemistry();

// 	}
// class Teacher {

// 	public void programming() {
// 		System.out.println("Java programming...");
// 	}

// 	void physics() {

// 		System.out.println("Physics...");
// 	}

// 	void chemistry() {

// 		System.out.println("Chemistry...");

// 	}
// }

// // Inherits feature of Teacher class
// class ComputerDepartment extends Teacher {

// 	public void learn() {
// 		System.out.println("ComputerDepartment : Learn...");
// 	}

// }

// Inherits feature of same Teacher class
// class ScienceDepartment extends Teacher {

// 	public void learn() {
// 		System.out.println("\nScienceDepartment : Learn...");
// 	}
//}
