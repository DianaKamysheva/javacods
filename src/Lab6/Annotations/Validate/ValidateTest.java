package Lab6.Annotations.Validate;

@Validate(value = {String.class, Integer.class})
public class ValidateTest {
    public static void main(String[] args) {
        // Пример использования аннотированного класса
        ValidateTest example = new ValidateTest();
        System.out.println("Класс ExampleClass аннотирован @Validate с значениями String.class и Integer.class");
    }
}
