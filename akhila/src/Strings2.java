public class Strings2 {
    int rollno;
    String name;
    String city;
    public void string1(){
        //StringBuffer s1=new StringBuffer();
        StringBuffer s2=new StringBuffer("akhila");
        //StringBuffer s3=new StringBuffer();
        s2.append("Hi");
        System.out.println(s2);
        s2.insert(1,"java");
        System.out.println(s2);
        s2.replace(1,4,"Kava");
        System.out.println(s2);
        s2.delete(2,6);
        System.out.println(s2);
        s2.reverse();
        System.out.println(s2);
        s2.capacity();
        System.out.println(s2);
        s2.ensureCapacity(17);
        System.out.println(s2);
        System.out.println(s2.capacity());
    }
    public void string2(){
        StringBuilder s1=new StringBuilder();
        System.out.println(s1.capacity());
        StringBuilder s2=new StringBuilder("Hello");
        StringBuilder s3=new StringBuilder(6);
        System.out.println(s3.capacity());
        s2.append("java");
        System.out.println(s2);
        StringBuilder s4=new StringBuilder();
        System.out.println(s4.toString());
    }
    Strings2(int rollno,String name,String city){
        this.rollno=rollno;
        this.name=name;
        this.city=city;
    }
    public String toString(){
        return rollno+" "+name+" "+city;
    }
    public static void main(String[] args) {
        Strings2 s1=new Strings2(5,"ram","ddk");
        Strings2 s2=new Strings2(6,"akhila","lucknow");
        s1.string1();
        s2.string2();
        System.out.println(s1);
        System.out.println(s2);
    }

    
}
//append(): concats the given string with the string
//insert(): inserts the given string from the beginindex and endindex
//replace(): replace a string with another string
//delete(): deletes the string from start index to end index
//reverse(): reverses the string
//capacity(): returns the length or capacity of the string
//ensureCapacity(): ensures that the given capacity is the minimum to the current capacity
//all the methods of stringBuilder are similar to the stringBuffer
/*
 string vs stringbuffer vs stringbuilder
 string:
 >string class is immutable i.e., not changeable
 >string is slow and consumes more memory when u concat too many strings
 because it creates new instance
 >overrides the equals() method of object class . so u can compare two strings by equals() method

 stringbuffer:
 >mutable means changeable
 >is fast and consumes less memory when u concat strings
 > doesn't override the equals() method
 >is synchronized i.e, thread safe
  it means 2 threads can't call the methods of stringbuffer simultaneously
  less efficient than stringbuilder

  stringbuilder:
  >non-synchronized i.e, not thread safe
  it means 2 threads can call the methods of stringbuilder simultaneously
  >more efficient than stringbuffer
 */
//toString(): if u want to represent any object as a string we use toString() method
//returns the string representation of the object
//by overriding toString() of the objectclass we can return values of the object
