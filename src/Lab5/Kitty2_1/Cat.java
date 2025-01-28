package Lab5.Kitty2_1;


public class Cat implements Meowable {
    private final String name;
    private int meowCount;

    public Cat(String name) {
        this.name = name;
        this.meowCount = 0;
    }

    @Override
    public void meow() {
        System.out.println(name + ": мяу!");
        meowCount++;
    }

    public int getMeowCount() {
        return meowCount;
    }

    @Override
    public String toString() {
        return "Кот: " + name;
    }
}