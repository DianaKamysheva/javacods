package Lab4.Task1_1;

public class Box<T> {
    private T content;

    // Конструктор для создания пустой коробки
    public Box() {
        this.content = null;
    }

    // Метод для размещения объекта в коробке
    public void put(T content) {
        if (this.content != null) {
            throw new IllegalStateException("Коробка уже заполнена");
        }
        this.content = content;
    }

    // Метод для получения объекта из коробки без обнуления
    public T peek() {
        return this.content;
    }

    // Метод для получения объекта из коробки с обнулением
    public T get() {
        T temp = this.content;
        this.content = null; // Обнуляем ссылку на объект
        return temp;
    }

    // Метод для проверки на заполненность
    public boolean isEmpty() {
        return this.content == null;
    }

    @Override
    public String toString() {
        return "Box{" +
                "content=" + content +
                '}';
    }
}
