package HashSetAssignment;
import java.util.*;
import java.util.stream.Collectors;
public class P13 {
    public static void main(String[] args) {
        String[] array = {"a", "b", "c"};
        Set<String> set = new HashSet<>(Arrays.stream(array).collect(Collectors.toSet()));
        System.out.println("Array to set");
        System.out.println("Set: " + set);
        String[] array1 = new String[set.size()];
        set.toArray(array);
        System.out.println("set to array");
        System.out.println("Array: " + Arrays.toString(array1));
    }
}
    

