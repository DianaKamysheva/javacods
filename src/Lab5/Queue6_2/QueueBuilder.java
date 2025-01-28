package Lab5.Queue6_2;
//Очередь 6
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

class QueueBuilder {
    public static Queue<Integer> buildQueue(List<Integer> list) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            queue.add(list.get(i));
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            queue.add(list.get(i));
        }
        return queue;
    }
}

