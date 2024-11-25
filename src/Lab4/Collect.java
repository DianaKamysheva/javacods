package Lab4;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Collect {
    public static <T, P> List<P> collect(List<T> list, Function<T, P> function) {
        return list.stream().map(function).collect(Collectors.toList());
    }
}
