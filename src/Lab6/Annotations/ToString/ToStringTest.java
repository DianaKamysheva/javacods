package Lab6.Annotations.ToString;

@ToString
public class ToStringTest {
    @ToString(value = "NO")
    private String field;

    private int number;

    @Override
    public String toString() {
        return "Пример. Поле='" + field + "', Число=" + number + "}";
    }
}
