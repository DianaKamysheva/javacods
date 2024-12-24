package Lab4.Task1;

class ExampleComparable implements Comparable<String> {
    @Override
    public int compare(String obj) {
        // Сравнение строк по длине
        return this.toString().length() - obj.length();
    }

    @Override
    public String toString() {
        return "Пример строки";
    }
}
