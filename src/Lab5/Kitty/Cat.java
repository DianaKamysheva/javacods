package Lab5.Kitty;

import Lab5.Kitty.MeowCounter;

//Структурные паттерны 2
interface Meowable {
    void meow();
}

public class Cat implements Meowable {
    private String name;
    private MeowCounter meowCounter;

    public Cat(String name) {
        this.name = name;
        this.meowCounter = new MeowCounter();
    }

    @Override
    public void meow() {
        System.out.println(name + ": мяу!");
        meowCounter.increment();
    }

    public int getMeowCount() {
        return meowCounter.getCount();
    }

    @Override
    public String toString() {
        return "кот: " + name;
    }
}

