package Lab5;
//
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

class QueueBuilder {
    public static Queue<Integer> buildQueue(List<Integer> L) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < L.size(); i++) {
            queue.add(L.get(i));
        }
        for (int i = L.size() - 1; i >= 0; i--) {
            queue.add(L.get(i));
        }
        return queue;
    }
}
