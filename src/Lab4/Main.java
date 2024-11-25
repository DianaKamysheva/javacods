package Lab4;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("***** Задание 1.1 *****");

        // Задание 1.1
        // Создаем коробку для хранения целочисленного значения
        Box<Integer> integerBox = new Box<>();
        // Ввод числа с клавиатуры
        System.out.println("Введите целое число для размещения в коробке:");
        int number = scanner.nextInt();
        // Размещаем число в коробке
        try {
            integerBox.put(number);
        } catch (IllegalStateException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        // Передаем коробку в метод и извлекаем значение
        Integer value = getBoxContent(integerBox);
        // Выводим значение на экран
        System.out.println("Значение из коробки: " + value);


        //Задание 1.3
        System.out.println("\n***** Задание 1.3 *****");

        // Ввод данных для класса Number
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        Number number1 = new Number(num1);
        Number number2 = new Number(num2);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println("Результат сравнения чисел: " + number1.compare(number2));

        // Ввод данных для класса StringType
        System.out.print("Введите первую строку: ");
        String str1 = scanner.next();
        System.out.print("Введите вторую строку: ");
        String str2 = scanner.next();

        StringType string1 = new StringType(str1);
        StringType string2 = new StringType(str2);

        System.out.println(string1);
        System.out.println(string2);
        System.out.println("Результат сравнения строк: " + string1.compare(string2));


        // Задание 2.2
        System.out.println("***** Задание 2.2 *****");
        Box<Integer> box1 = new Box<>();
        Box<Integer> box2 = new Box<>();
        Box<Integer> box3 = new Box<>();
        box1.put(3);
        box2.put(5);
        box3.put(7);
        List<Box<? extends Number>> boxes = Arrays.asList(box1, box2, box3);
        System.out.println("Максимальное значение: " + MaxFinder.findMax(boxes));


        // Задание 3.1
        System.out.println("***** Задание 3.1 *****");
        List<String> strings = Arrays.asList("qwerty", "asdfg", "zx");
        List<Integer> lengths = Function.applyFunction(strings, String::length);
        System.out.println("Длины строк: " + lengths);

        List<Integer> numbers = Arrays.asList(1, -3, 7);
        List<Integer> positiveNumbers = Function.applyFunction(numbers, Math::abs);
        System.out.println("Положительные числа: " + positiveNumbers);

        List<int[]> arrays = Arrays.asList(new int[]{1, 2, 3}, new int[]{4, 5, 6}, new int[]{7, 8, 9});
        List<Integer> maxValues = Function.applyFunction(arrays, arr -> Arrays.stream(arr).max().getAsInt());
        System.out.println("Максимальные значения: " + maxValues);

        // Задание 3.2
        System.out.println("***** Задание 3.2 *****");
        List<String> filteredStrings = Filter.applyFilter(strings, s -> s.length() >= 3);
        System.out.println("Отфильтрованные строки: " + filteredStrings);

        List<Integer> filteredNumbers = Filter.applyFilter(numbers, n -> n < 0);
        System.out.println("Отфильтрованные числа: " + filteredNumbers);

        List<int[]> filteredArrays = Filter.applyFilter(arrays, arr -> Arrays.stream(arr).noneMatch(n -> n > 0));
        System.out.println("Отфильтрованные массивы: " + filteredArrays);

        // Задание 3.3
        System.out.println("***** Задание 3.3 *****");
        String concatenatedString = Reduce.reduce(strings, (s1, s2) -> s1 + s2);
        System.out.println("Объединенная строка: " + concatenatedString);

        int sum = Reduce.reduce(numbers, Integer::sum);
        System.out.println("Сумма чисел: " + sum);

        int totalElements = Reduce.reduce(arrays, (arr1, arr2) -> {
            int[] combined = new int[arr1.length + arr2.length];
            System.arraycopy(arr1, 0, combined, 0, arr1.length);
            System.arraycopy(arr2, 0, combined, arr1.length, arr2.length);
            return combined;
        }).length;
        System.out.println("Общее количество элементов: " + totalElements);

        // Задание 3.4
        System.out.println("***** Задание 3.4 *****");
        List<List<Integer>> partitionedNumbers = Collect.collect(numbers, n -> n < 0 ? Arrays.asList(n) : Arrays.asList());
        System.out.println("Разбитые числа: " + partitionedNumbers);

        List<List<String>> partitionedStrings = Collect.collect(strings, s -> Arrays.asList(s));
        System.out.println("Разбитые строки: " + partitionedStrings);

        List<String> uniqueStrings = Collect.collect(strings, s -> s);
        System.out.println("Уникальные строки: " + uniqueStrings);

        scanner.close();
    }
    // Метод для извлечения содержимого коробки
    public static <T> T getBoxContent(Box<T> box) {
        return box.get();
    }
}

