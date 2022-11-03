package Assignment1;


public class HalfpyramidAPLHABET {
    public static void main(String[] args) {
        char start = 'A', end = 'F';

        for (int i = 1; i <= (end - 'A' + 1); ++i) {
            for (int j = 1; j <= i; ++j) {
            System.out.print(start + " ");
            }
            ++start;
            System.out.println();
        }   
    }
}
