
package Lab2;

class Person {
    private Object name;
    private int height;

    //Конструктор для создания объекта Person с именем (строкой) и ростом.
    public Person(String name, int height) {
        setName(name);
        setHeight(height);
    }

    //Конструктор для создания объекта Person с именем (объектом Name) и ростом.
    public Person(Name name, int height) {
        if (name == null) {
            throw new IllegalArgumentException("Имя не может быть null."); // Защита от null для объекта Name
        }
        this.name = name.toString();
        setHeight(height);
    }

    //Метод устанавливает имя человека.
    public void setName(Object name) {
        if (name == null) {
            throw new IllegalArgumentException("Имя не может быть пустым или null."); // Защита от пустого значения
        }
        this.name = name;
    }

    //Метод устанавливает рост человека.
    public void setHeight(int height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Рост должен быть положительным числом."); // Защита от некорректного роста
        }
        this.height = height;
    }

    @Override
    //Метод возвращает строковое представление объекта Person.
    public String toString() {
        return "Имя: " + name + ", рост: " + height;
    }
}
