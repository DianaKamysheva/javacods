package Lab5;
//Структурные паттерны
interface Meowable {
    void meow();
}

class Cat implements Meowable {
    private String name;
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
        return "кот: " + name;
    }
}

class Funs {
    public static void meowsCare(Meowable meowable) {
        for (int i = 0; i < 3; i++) {
            meowable.meow();
        }
    }
}
