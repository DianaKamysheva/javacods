package Lab4;

import java.util.Scanner;

// Интерфейс Comparable
interface Comparable {
    int compare(Object obj);
}

// Класс для задачи 1
class Task1 implements Comparable {
    private int value;

    public Task1(int value) {
        this.value = value;
    }

    @Override
    public int compare(Object obj) {
        if (obj instanceof Task1) {
            return Integer.compare(this.value, ((Task1) obj).value);
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Task1{value =" + value + "}";
    }
}

// Класс для задачи 2
class Task2 implements Comparable {
    private String string;

    public Task2(String string) {
        this.string = string;
    }

    @Override
    public int compare(Object obj) {
        if (obj instanceof Task2) {
            return this.string.compareTo(((Task2) obj).string);
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Task2{string =" + string + "}";
    }
}