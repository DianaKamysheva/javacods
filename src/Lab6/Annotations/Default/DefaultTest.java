package Lab6.Annotations.Default;

@Default(value = String.class)
public class DefaultTest {
    @Default(value = Integer.class)
    private int exampleField;

    public static void main(String[] args) {
        // Пример использования аннотированного класса
        DefaultTest example = new DefaultTest();
        System.out.println("Класс ExampleClass аннотирован @Default с значением String.class");
    }
}
