package Lab5;
//
import java.util.List;
import java.util.ArrayList;

class ListReplacer {
    public static List<Integer> replaceFirstOccurrence(List<Integer> L, List<Integer> L1, List<Integer> L2) {
        int index = L.indexOf(L1.get(0));
        if (index != -1 && L.subList(index, index + L1.size()).equals(L1)) {
            List<Integer> result = new ArrayList<>(L);
            result.subList(index, index + L1.size()).clear();
            result.addAll(index, L2);
            return result;
        }
        return L;
    }
}
