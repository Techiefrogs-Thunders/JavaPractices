package BasicAssignments;

public class Assignment26 {
    public static void main(String[] args) {
        int  number = 1;

    for(int i = 1; i <= 4; i++) {

      for(int j = 1; j <= i; j++,++number) {
        System.out.print(number + " ");
      }

      System.out.println();
    }
    }
}
