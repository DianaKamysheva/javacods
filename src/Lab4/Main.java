package Lab4;

import java.util.ArrayList;
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
        int number = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                break;
            } else {
                System.out.println("Ошибка: Введенное значение не является целым числом. Пожалуйста, попробуйте снова.");
                scanner.next(); // Очистка буфера
            }
        }

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

        // Ввод данных для Task1
        System.out.print("Введите целое число для Task1: ");
        int value1 = scanner.nextInt();
        Task1 task1 = new Task1(value1);

        // Ввод данных для Task2
        System.out.print("Введите строку для Task2: ");
        String string2 = scanner.next();
        Task2 task2 = new Task2(string2);

        // Демонстрация работы методов
        System.out.println("Task1: " + task1.toString());
        System.out.println("Task2: " + task2.toString());

        // Сравнение объектов
        System.out.print("Введите целое число для сравнения с Task1: ");
        int compareValue1 = scanner.nextInt();
        Task1 compareTask1 = new Task1(compareValue1);
        System.out.println("Результат сравнения Task1: " + task1.compare(compareTask1));

        System.out.print("Введите строку для сравнения с Task2: ");
        String compareString2 = scanner.next();
        Task2 compareTask2 = new Task2(compareString2);
        System.out.println("Результат сравнения Task2: " + task2.compare(compareTask2));


        // Задание 2.2
        System.out.println("\n***** Задание 2.2 *****");
        List<Box<Number>> boxes = new ArrayList<>();

        System.out.println("Введите количество коробок:");
        int numberOfBoxes = getValidInt(scanner);

        // Заполнение коробок
        for (int i = 0; i < numberOfBoxes; i++) {
            System.out.println("Введите целое число для коробки " + (i + 1) + ":");
            int number1 = getValidInt(scanner);
            Box<Number> box = new Box<>();
            box.put(number1);
            boxes.add(box);
        }

        // Поиск максимального значения
        double maxValue = MaxFinder.findMaxValue(boxes);
        if (Double.isNaN(maxValue)) {
            System.out.println("Нет значений для поиска максимума.");
        } else {
            System.out.println("Максимальное значение: " + maxValue);
        }

        // Вывод всех коробок
        System.out.println("Содержимое всех коробок:");
        for (Box<Number> box : boxes) {
            System.out.println(box);
        }
    }

    private static int getValidInt(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Ошибка: Введенное значение не является целым числом. Пожалуйста, попробуйте снова.");
                scanner.next(); // Очистка буфера
            }
        }


        // Задание 3.1
        System.out.println("***** Задание 3.1 *****");
        List<String> strings = Arrays.asList("qwerty", "asdfg", "zx");
        List<Integer> lengths = Function.applyFunction(strings, n -> String.length(n));
        System.out.println("Длины строк: " + lengths);

        List<Integer> numbers = Arrays.asList(1, -3, 7);
        List<Integer> positiveNumbers = Function.applyFunction(numbers, n -> Math.abs(n));
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