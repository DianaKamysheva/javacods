package Lab4;

import java.util.List;
import java.util.ArrayList;
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
        int number = getValidInt(scanner);

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


        // Метод для извлечения содержимого коробки
        public static <T > T getBoxContent(Box < T > box) {
            return box.get();
        }


        // Метод для проверки корректности ввода целых чисел
        private static int getValidInt (Scanner scanner){
            while (true) {
                if (scanner.hasNextInt()) {
                    return scanner.nextInt();
                } else {
                    System.out.println("Ошибка: Введенное значение не является целым числом. Пожалуйста, попробуйте снова.");
                    scanner.next(); // Очистка буфера
                }
            }
        }
    }


