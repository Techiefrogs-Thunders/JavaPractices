class Encaps {
   
   String name;
  public void myName(String name) {
    this.name = name;
  }
  private String idNum;
  public int age;
  public void setAge(int age) {
    this.age = age;
  }
  public void setIdNum(String idNum) {
    this.idNum = idNum;
  }
  public String myName() {
    return name;
  }
  public String getIdNum() {
    return idNum;
  }
  public int getAge() {
    return age;
  }
 

  
}

public class Encapsulation {

  public static void main(String args[]) {
    Encaps encap = new Encaps();
    encap.myName("James");
    encap.setAge(20);
    encap.setIdNum("1234321");
 
    System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());
  }
}