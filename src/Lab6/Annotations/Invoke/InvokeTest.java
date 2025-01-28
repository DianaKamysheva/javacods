package Lab6.Annotations.Invoke;

public class InvokeTest {
    @Invoke
    public void annotatedMethod() {
        System.out.println("Этот метод аннотирован @Invoke");
    }

    public static void main(String[] args) {
        InvokeTest example = new InvokeTest();
        example.annotatedMethod();
    }
}
