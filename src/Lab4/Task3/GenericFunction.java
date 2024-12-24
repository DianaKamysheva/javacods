package Lab4.Task3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GenericFunction {

    public static <T, P> List<P> transformList(List<T> inputList, Function<T, P> transformer) {
        return inputList.stream()
                .map(transformer)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        // длина строк
        List<String> strings = Arrays.asList("qwerty", "asdfg", "zx");
        List<Integer> lengths = transformList(strings, String::length);
        System.out.println("Длины строк: " + lengths);

        // модуль чисел
        List<Integer> numbers = Arrays.asList(1, -3, 7);
        List<Integer> absoluteValues = transformList(numbers, Math::abs);
        System.out.println("Абсолютные значения: " + absoluteValues);

        // максимальные значения из массивов
        List<int[]> arrays = Arrays.asList(
                new int[]{1, 2, 3},
                new int[]{5, -1, 0},
                new int[]{7, 7, 7}
        );

        List<Integer> maxValues = transformList(arrays, array ->
                Arrays.stream(array).max().orElseThrow()
        );
        System.out.println("Максимальные значения: " + maxValues);
    }
}
