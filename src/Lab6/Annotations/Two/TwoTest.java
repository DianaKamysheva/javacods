package Lab6.Annotations.Two;

@Two(first = "Первое значение", second = 42)
public class TwoTest {
    public static void main(String[] args) {
        // Пример использования аннотированного класса
        TwoTest example = new TwoTest();
        System.out.println("Класс ExampleClass аннотирован @Two с значениями first = \"Первое значение\" и second = 42");
    }
}
