package Lab5;
//7.1
import java.util.List;
import java.util.stream.Collectors;

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "{" + x + ";" + y + "}";
    }
}

class Line {
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "Линия от " + start + " до " + end;
    }
}

class Polyline {
    private List<Point> points;

    public Polyline(List<Point> points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Линия " + points.stream().map(Point::toString).collect(Collectors.joining(", ", "[", "]"));
    }
}

class PointProcessor {
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
