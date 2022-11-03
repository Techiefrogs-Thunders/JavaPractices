public class Switch4 {
    public static void main(String[] args) {
  
      int number = 55;
      String size;
  
      // switch statement to check size
      switch (number) {
  
        case 29:
            size = "Small";
            break;
  
        case 42:
            size = "Medium";
            break;
  
        case 44:
            size = "Large";
            break;
  
        case 48:
            size = "Extra Large";
            break;
        
        case 50:
            size = "Extra Extra Large";
            break;

        default:
          size = "ERROR";
          break;
  
      }
      System.out.println("Size: " + size);
    }
  }
    
