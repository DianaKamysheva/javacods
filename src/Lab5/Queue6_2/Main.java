package Lab5.Queue6_2;

import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // Задание 6: Очередь
        System.out.println("\nЗадание 6_2");
        List<Integer> listQueue = Arrays.asList(1, 2, 3);
        Queue<Integer> queue = QueueBuilder.buildQueue(listQueue);
        System.out.println("Queue: " + queue);
    }
}
