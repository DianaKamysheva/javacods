package Lab4;

// Интерфейс Сравнимое
public interface Comparable<T> {
    int compare(T obj);
}

// Класс, реализующий интерфейс Сравнимое
class Number implements Comparable<Number> {
    private int value;

    public Number(int value) {
        this.value = value;
    }

    @Override
    public int compare(Number obj) {
        return Integer.compare(this.value, obj.value);
    }

    @Override
    public String toString() {
        return "Число: " + value;
    }
}

// Класс, реализующий интерфейс Сравнимое
class StringType implements Comparable<StringType> {
    private String value;

    public StringType(String value) {
        this.value = value;
    }

    @Override
    public int compare(StringType obj) {
        return this.value.compareTo(obj.value);
    }

    @Override
    public String toString() {
        return "Строка: " + value;
    }
}