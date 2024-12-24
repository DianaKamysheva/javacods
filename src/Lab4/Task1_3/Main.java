package Lab4.Task1_3;

public class Main {
    public static void main(String[] args) {
        // Создаем объект класса ПримерСравнимого
        ExampleComparable example = new ExampleComparable();

        // Вызываем метод "сравнить" с различными строками
        System.out.println(example.compare("Test")); // Разница в длине строк
        System.out.println(example.compare("ExampleComparable"));
    }
}

// Пример строки - 13 символов
// Тест - 4 символа
// ПримерСравнимого - 16 символов
//
// 13 - 4 = 9
// 13 - 16 = -3
