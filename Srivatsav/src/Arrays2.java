import java.util.Arrays;

public class Arrays2 {
    public static void main(String[] args) {
        int[] grades = {10,9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(grades));
        for (int j = 0; j < grades.length; j++) {
            System.out.print(grades[j]+" ");
        }
        System.out.println();
        int[][] grade ={{10,9,8,7,6},{5,4,3,2,1}};
        System.out.println(Arrays.deepToString(grade));
    }

}
