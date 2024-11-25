package Lab4;

import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce {
    public static <T> T reduce(List<T> list, BinaryOperator<T> accumulator) {
        return list.stream().reduce(accumulator).orElse(null);
    }
}