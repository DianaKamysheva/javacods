package Lab5.Streams1;

import java.util.List;
import java.util.stream.Collectors;
//Убирает лишние значения согласно заданию
public class PointProcessor {
    public static Polyline processPoints(List<Point> points) {
        return new Polyline(points.stream()
                .distinct()
                .sorted((p1, p2) -> Double.compare(p1.getX(), p2.getX()))
                .peek(p -> {
                    if (p.getY() < 0) {
                        p = new Point(p.getX(), -p.getY());
                    }
                })
                .collect(Collectors.toList()));
    }
}

