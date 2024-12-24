package Lab4.Task2_2;

import Lab4.Task1_1.Box;

import java.util.List;

public class MaxFinder {
    public static double findMaxValue(List<Box<Number>> boxes) {
        double maxValue = Double.NaN;
        for (Box<Number> box : boxes) {
            Number content = box.peek();
            if (content != null) {
                double value = content.doubleValue();
                if (Double.isNaN(maxValue) || value > maxValue) {
                    maxValue = value;
                }
            }
        }
        return maxValue;
    }
}