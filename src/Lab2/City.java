package Lab2;

import java.util.ArrayList;

class City {
    private String name;
    private ArrayList<Route> routes;

    // Конструктор
    public City(String name) {
        setName(name);
        this.routes = new ArrayList<>();
    }

    // Добавление маршрута
    public void addRoute(City destination, int cost) {
        if (destination == null) {
            throw new IllegalArgumentException("Пункт назначения не может быть null.");
        }
        if (cost < 0) {
            throw new IllegalArgumentException("Стоимость маршрута не может быть отрицательной.");
        }
        routes.add(new Route(destination, cost));
    }

    // Установка имени с проверкой
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя города не может быть пустым или null.");
        }
        this.name = name;
    }

    // Текстовое представление города
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Город: ").append(name).append("\n");
        if (!routes.isEmpty()) {
            sb.append("Маршруты:\n");
            for (Route route : routes) {
                sb.append(route.toString()).append("\n");
            }
        }
        return sb.toString();
    }

    // Внутренний класс для представления маршрута
    private class Route {
        private City destination;
        private int cost;

        // Конструктор
        public Route(City destination, int cost) {
            if (destination == null) {
                throw new IllegalArgumentException("Пункт назначения маршрута не может быть null.");
            }
            if (cost < 0) {
                throw new IllegalArgumentException("Стоимость маршрута не может быть отрицательной.");
            }
            this.destination = destination;
            this.cost = cost;
        }

        // Текстовое представление маршрута
        @Override
        public String toString() {
            return "    В город " + destination.name + " (" + cost + " руб)";
        }
    }
}