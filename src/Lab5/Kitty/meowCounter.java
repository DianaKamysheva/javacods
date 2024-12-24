package Lab5.Kitty;

class MeowCounter {
    private int meowCount;

    public MeowCounter() {
        this.meowCount = 0;
    }

    public void increment() {
        meowCount++;
    }

    public int getCount() {
        return meowCount;
    }
}
