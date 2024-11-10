package Lab3;

import java.util.ArrayList;

class City {
    private String name;
    private ArrayList<Lab3.City.Route> routes;

    // Конструктор для создания города только с именем
    public City(String name) {
        setName(name);
        this.routes = new ArrayList<>();
    }
    // Конструктор для создания города с именем и набором путей
    public City(String name, ArrayList routes) {
        setName(name);
        this.routes = routes;
    }

    // Добавление маршрута
    public void addRoute(Lab3.City destination, int cost) {
        if (destination == null) {
            throw new IllegalArgumentException("Пункт назначения не может быть null.");
        }
        if (cost < 0) {
            throw new IllegalArgumentException("Стоимость маршрута не может быть отрицательной.");
        }
        routes.add(new Lab3.City.Route(destination, cost));
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
            for (Lab3.City.Route route : routes) {
                sb.append(route.toString()).append("\n");
            }
        }
        return sb.toString();
    }

    // Внутренний класс для представления маршрута
    private class Route {
        private Lab3.City destination;
        private int cost;

        // Конструктор
        public Route(Lab3.City destination, int cost) {
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