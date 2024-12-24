package Lab6.Annotations.Default;

@Default(value = String.class)
public class DefaultTest {
    @Default(value = Integer.class)
    private String field;
}
