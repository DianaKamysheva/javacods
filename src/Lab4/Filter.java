package Lab4;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Filter {
    public static <T> List<T> applyFilter(List<T> list, Predicate<T> predicate) {
        return list.stream().filter(predicate).collect(Collectors.toList());
    }
}
