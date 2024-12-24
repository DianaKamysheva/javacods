package Lab4.Task3;
//3_3

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce {

    // Метод для сведения списка к одному значению
    public static <T> T reduce(List<T> items, BinaryOperator<T> reducer, T identity) {
        if (items == null) {
            return identity;
        }
        // по условию не должен возвращать null

        T result = identity, tempResult;
        for (T item : items) {
            tempResult = reducer.apply(result, item);

            if (tempResult != null) {
                result = tempResult;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Объединение строк в одну строку
        List<String> strings = Arrays.asList("qwerty", "asdfg", "zx");
        String concatenated = reduce(strings, String::concat, "");
        System.out.println("В одной строке: " + concatenated);

        // Сумма целых чисел
        List<Integer> numbers = Arrays.asList(1, -3, 7);
        int sum = reduce(numbers, Integer::sum, 0);
        System.out.println("Сумма целых чисел: " + sum);

        // Подсчёт общего количества элементов во вложенных списках
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );

        // преобразует список списков элементов в список количеств элементов списков
        List<Integer> totalCountsList = reduce(
                listOfLists,
                (acc, list) -> {
                    acc.add(list.size());
                    return acc;
                }, new ArrayList<>()
        );
        int totalCount = reduce(totalCountsList, Integer::sum, 0);
        System.out.println("Общее количество элементов: " + totalCount);
    }
}
