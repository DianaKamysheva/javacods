package Lab4.Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Filter {
    // Обобщённый метод для фильтрации списка
    public static <T> List<T> filter(List<T> list, Predicate<T> condition) {
        List<T> result = new ArrayList<>();
        for (T item : list) {
            if (condition.test(item)) {
                result.add(item);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // Фильтр строк с длиной < 3 символов
        List<String> strings = List.of("qwerty", "asdfg", "zx");
        List<String> filteredStrings = filter(strings, s -> s.length() >= 3);
        System.out.println("Строки с длиной >= 3 символов: " + filteredStrings);

        // Фильтр только положительных чисел
        List<Integer> numbers = List.of(1, -3, 7);
        List<Integer> filteredNumbers = filter(numbers, n -> n > 0);
        System.out.println("Положительные числа: " + filteredNumbers);

        // Фильтр массивов без элементов >= 0
        List<int[]> arrays = List.of(
                new int[]{-1, -2, -3},
                new int[]{1, -2, 3},
                new int[]{-4, -5, -6}
        );

        List<int[]> filteredArrays = filter(arrays, array -> {
            for (int num : array) {
                if (num > 0) {
                    return false;
                }
            }
            return true;
        });

        System.out.println("Массивы без положительных элементов: ");
        for (int[] arr : filteredArrays) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
