public class Array01 {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 5, 3},
            {8, 4, 2, 7, 1, 5, 6},
            {4, 6, 2},
            {},
            {5, 7}
        };
        System.out.println(arr.length);
        System.out.println(arr[3].length);

        for (int rows = 0; rows < arr.length; rows++) {
            for (int col = 0; col < arr[rows].length; col++) {
                System.out.print(arr[rows][col]+" ");
            }
            System.out.println();
        }
    }
}
