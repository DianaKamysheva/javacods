package Lab4.Task1;

public class Main {
    public static void main(String[] args) {
        // Создаем объект класса ПримерСравнимого
        ExampleComparable пример = new ExampleComparable();

        // Вызываем метод "сравнить" с различными строками
        System.out.println(пример.compare("Тест")); // Разница в длине строк
        System.out.println(пример.compare("ПримерСравнимого"));
    }
}

// Пример строки - 13 символов
// Тест - 4 символа
// ПримерСравнимого - 16 символов
//
// 13 - 4 = 9
// 13 - 16 = -3
