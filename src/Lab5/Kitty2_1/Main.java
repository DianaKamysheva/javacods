package Lab5.Kitty2_1;

// Задание 2: Структурные шаблоны

public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадание 2.1:\n");
        Cat cat = new Cat("Мурзик");
        cat.meow();
        System.out.println();
        Funs.meowsCare(cat, cat, cat, cat, cat); // Вызываем метод 5 раз
        System.out.println("\nВнутри метода кот помяукал " +
                " раз\nВсего кот мяукал " + cat.getMeowCount() + " раз");
    }
}