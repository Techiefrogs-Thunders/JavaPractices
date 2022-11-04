public class Variables {
     int i=5;
     byte b;
     char c;
     short s;
     long l;
     float f;
     boolean flag;
     double d;
     public void display (){
        System.out.println("i value is:"+i);
        System.out.println("b value is:"+b);
        System.out.println("c value is:"+c);
        System.out.println("s value is:"+s);
        System.out.println("l value is:"+l);
        System.out.println("f value is:"+f);
        System.out.println("d value is:"+d);
        System.out.println("boolean value is:"+flag);

      }


    public static void main(String[] args) {
        Variables obj = new Variables();
        obj.display();
        }
        
    }
