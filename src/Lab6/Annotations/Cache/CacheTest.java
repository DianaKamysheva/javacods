package Lab6.Annotations.Cache;

@Cache(value = {"cache1", "cache2"})
public class CacheTest {
    public static void main(String[] args) {
        // Пример использования аннотированного класса
        CacheTest example = new CacheTest();
        System.out.println("Класс ExampleClass аннотирован @Cache с значениями \"cache1\" и \"cache2\"");
    }
}