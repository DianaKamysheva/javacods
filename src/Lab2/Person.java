
package Lab2;

class Person {
    private String name;
    private int height;

    public Person(String name, int height) {
        setName(name);
        setHeight(height);
    }

    public Person(Name name, int height) {
        if (name == null) {
            throw new IllegalArgumentException("Имя не может быть null."); // Защита от null для объекта Name
        }
        this.name = name.toString();
        setHeight(height);
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть пустым или null."); // Защита от пустого значения
        }
        this.name = name;
    }

    public void setHeight(int height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Рост должен быть положительным числом."); // Защита от некорректного роста
        }
        this.height = height;
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", рост: " + height;
    }
}
