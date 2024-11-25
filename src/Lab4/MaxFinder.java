package Lab4;

import java.util.List;

public class MaxFinder {
    public static double findMax(List<Box<Integer>> boxes) {
        double max = Double.NEGATIVE_INFINITY;
        for (Box<? extends Number> box : boxes) {
            if (!box.isEmpty()) {
                Number number = (Number) box.get();
                max = Math.max(max, number.compare(number));
            }
        }
        return max;
    }
}