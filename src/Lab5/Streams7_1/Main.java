package Lab5.Streams7_1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадание 7.1");
        List<Point> points = Arrays.asList(new Point(1, -2), new Point(3, 4), new Point(1, 2));
        Polyline polyline = PointProcessor.processPoints(points);
        System.out.println("Polyline: " + polyline);

    }
}