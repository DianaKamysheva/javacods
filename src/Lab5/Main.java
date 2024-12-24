package Lab5;

import Lab5.Fractionsss.Fraction;
import Lab5.Kitty.Cat;
import Lab5.Kitty.Funs;
import Lab5.Streams1.Point;
import Lab5.Streams1.PointProcessor;
import Lab5.Streams1.Polyline;

import java.util.Arrays;
import java.util.List;
import java.util.Queue;


public class Main {
    public static void main(String[] args) {
        // Задание 1: Шаблоны
        System.out.println("\nЗадание 1");
        Fraction fraction = new Fraction(3, 4);
        System.out.println("Дробь: " + fraction);
        System.out.println("Действительное значение: " + fraction.getRealValue());

        // Задание 2: Структурные шаблоны
        System.out.println("\nЗадание 2");
        Cat cat = new Cat("Мурзик");
        Funs.meowsCare(cat);
        System.out.println("Количество мяуканий: " + cat.getMeowCount());

        // Задание 3: Список
        System.out.println("\nЗадание 3");
        List<Integer> L = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> L1 = Arrays.asList(2, 3);
        List<Integer> L2 = Arrays.asList(6, 7);
        List<Integer> resultList = ListReplacer.replaceFirstOccurrence(L, L1, L2);
        System.out.println("Result List: " + resultList);

        // Задание 6: Очередь
        System.out.println("\nЗадание 6");
        List<Integer> LQueue = Arrays.asList(1, 2, 3);
        Queue<Integer> queue = QueueBuilder.buildQueue(LQueue);
        System.out.println("Queue: " + queue);

        // Задание 7.1: Обработка точек и создание ломаной линии
        System.out.println("\nЗадание 7.1");
        List<Point> points = Arrays.asList(new Point(1, -2), new Point(3, 4), new Point(1, 2));
        Polyline polyline = PointProcessor.processPoints(points);
        System.out.println("Polyline: " + polyline);

    }
}

