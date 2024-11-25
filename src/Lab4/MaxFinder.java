package Lab4;

import java.util.List;

public class MaxFinder {
    public static double findMaxValue(List<Box<Number>> boxes) {
        double max = Double.NEGATIVE_INFINITY; // Начальное значение для поиска максимума

        for (Box<Number> box : boxes) {
            if (!box.isEmpty()) {
                double value = box.get().doubleValue();
                if (value > max) {
                    max = value;
                }
            }
        }

        return max == Double.NEGATIVE_INFINITY ? Double.NaN : max; // Если не нашли, возвращаем NaN
    }
}
