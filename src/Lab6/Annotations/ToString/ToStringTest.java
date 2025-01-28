package Lab6.Annotations.ToString;

@ToString
public class ToStringTest {
    @ToString(value = "NO")
    private int exampleField;

    public static void main(String[] args) {
        // Пример использования аннотированного класса
        ToStringTest example = new ToStringTest();
        System.out.println("Класс ExampleClass аннотирован @ToString с значением YES");
    }
}
