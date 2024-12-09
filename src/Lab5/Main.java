package Lab5;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // Задание 1: Шаблоны
        Fraction fraction = new Fraction(3, 4);
        System.out.println("Fraction: " + fraction);
        System.out.println("Real Value: " + fraction.getRealValue());

        // Задание 2: Структурные шаблоны
        Cat cat = new Cat("Мурзик");
        Funs.meowsCare(cat);
        System.out.println("Количество мяуканий: " + cat.getMeowCount());

        // Задание 3: Список
        List<Integer> L = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> L1 = Arrays.asList(2, 3);
        List<Integer> L2 = Arrays.asList(6, 7);
        List<Integer> resultList = ListReplacer.replaceFirstOccurrence(L, L1, L2);
        System.out.println("Result List: " + resultList);

        // Задание 4: Мап
        try {
            Map<String, Integer> results = OlympiadResults.readResults("results.txt");
            OlympiadResults.printMaxScoreParticipants(results);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Задание 5: Сет
        try {
            Set<Character> unusedConsonants = UnusedConsonants.findUnusedConsonants("text.txt");
            System.out.println("Unused Consonants: " + unusedConsonants);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Задание 6: Очередь
        List<Integer> LQueue = Arrays.asList(1, 2, 3);
        Queue<Integer> queue = QueueBuilder.buildQueue(LQueue);
        System.out.println("Queue: " + queue);

        // Задание 7: Стрим
        List<Point> points = Arrays.asList(new Point(1, -2), new Point(3, 4), new Point(1, 2));
        Polyline polyline = PointProcessor.processPoints(points);
        System.out.println("Polyline: " + polyline);
    }
}
