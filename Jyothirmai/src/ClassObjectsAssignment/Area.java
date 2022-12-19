
package ClassObjectsAssignment;

public class Area {
    int length;
    int breath;
    Area(int l,int b){
        length = l;
        breath = b;
    }
    
    int returnArea(){
        int result = length*breath;
        return result;
    }
    
    public static void main(String[] args) {
        Area obj1=new Area(8,9);
        System.out.println(obj1.returnArea());
        }
    }