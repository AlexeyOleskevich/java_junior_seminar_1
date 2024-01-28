import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(
                1, 2, 5, 22, 23, 19, 48
        ));
        Double meanEven = nums
                .stream()
                .filter(num -> num % 2 == 0)
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
    }
}
