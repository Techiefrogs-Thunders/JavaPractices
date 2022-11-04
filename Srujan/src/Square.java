public class Square extends Rectangle1 {
    int s;
        Square(int s) {
            super(s, s);
                    System.out.println("Area of square:"+ (s*s));
                    System.out.println("Perimeter of square:"+ (4*s));
    
        }
    
        public static void main(String[] args) {
            Square obj=new Square(6);
            obj.area();
            obj.perimeter();
    
        }
    
    }