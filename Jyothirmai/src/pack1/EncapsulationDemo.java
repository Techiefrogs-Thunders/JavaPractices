package pack1;

public class EncapsulationDemo {

    private int i = 20;
    private String name = "Eagles";
    private String s = "abc";
    private float f = 123.1f;
    private boolean b = true;

    public int getI(){
        return i;
    }
    public String getName(){
        return name;
    }
    public String getS() {
        return s;
    }
    public void setS(String s) {
        this.s = s;
    }
    public float getF() {
        return f;
    }
    public void setF(float f) {
        this.f = f;
    }
    public boolean isB() {
        return b;
    }
    public void setB(boolean b) {
        this.b = b;
    }
    public void setI(int k){
        i=k;
    }
    public void setName(String l){
        this.name=l;
    }
    public static void main(String[] args) {
        EncapsulationDemo encObj = new EncapsulationDemo();
        System.out.println(encObj.getI());
        System.out.println(encObj.getName());
    }
}
