package BasicAssignments;

public class Assignment19 {
    public static void main(String[] args) {
        int alphabet = 65;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(alphabet+(i-1))+" ");
            }
            System.out.println();

        }
    }
}
