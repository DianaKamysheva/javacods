package Lab3;

// Класс для представления дроби
class Fraction {
    private int numerator; // числитель
    private int denominator; // знаменатель

    // Конструктор для создания дроби с заданными числителем и знаменателем
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю."); // Защита от деления на ноль
        }
        this.numerator = numerator; // инициализация числителя
        this.denominator = denominator; // инициализация знаменателя
        simplify();
    }

    // Метод для сложения двух дробей
    public Lab3.Fraction add(Lab3.Fraction other) {
        if (other == null) {
            throw new IllegalArgumentException("Дополнительная дробь не может быть null."); // Проверка на null
        }
        return new Lab3.Fraction(numerator * other.denominator + denominator * other.numerator,
                denominator * other.denominator);
    }

    // Метод для вычитания одной дроби из другой
    public Lab3.Fraction subtract(Lab3.Fraction other) {
        if (other == null) {
            throw new IllegalArgumentException("Дополнительная дробь не может быть null."); // Проверка на null
        }
        return new Lab3.Fraction(numerator * other.denominator - denominator * other.numerator,
                denominator * other.denominator);
    }

    // Метод для умножения двух дробей
    public Lab3.Fraction multiply(Lab3.Fraction other) {
        if (other == null) {
            throw new IllegalArgumentException("Дополнительная дробь не может быть null."); // Проверка на null
        }
        return new Lab3.Fraction(numerator * other.numerator, denominator * other.denominator);
    }

    // Метод для деления одной дроби на другую
    public Lab3.Fraction divide(Lab3.Fraction other) {
        if (other == null) {
            throw new IllegalArgumentException("Дополнительная дробь не может быть null."); // Проверка на null
        }
        if (other.numerator == 0) {
            throw new IllegalArgumentException("Нельзя делить на дробь с нулевым числителем."); // Защита от деления на ноль
        }
        return new Lab3.Fraction(numerator * other.denominator, denominator * other.numerator);
    }

    // Метод для сложения дроби с целым числом
    public Lab3.Fraction add(int number) {
        return new Lab3.Fraction(numerator + denominator * number, denominator);
    }

    // Метод для вычитания целого числа из дроби
    public Lab3.Fraction subtract(int number) {
        return new Lab3.Fraction(numerator - denominator * number, denominator);
    }

    // Метод для умножения дроби на целое число
    public Lab3.Fraction multiply(int number) {
        return new Lab3.Fraction(numerator * number, denominator);
    }

    // Метод для деления дроби на целое число
    public Lab3.Fraction divide(int number) {
        if (number == 0) {
            throw new IllegalArgumentException("Нельзя делить на ноль."); // Защита от деления на ноль
        }
        return new Lab3.Fraction(numerator, denominator * number);
    }

    // Метод для получения строкового представления дроби
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Метод для сокращения дроби
    private void simplify() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;

        if (denominator < 0) {
            numerator *= -1;
            denominator *= -1;
        }
    }

    // Метод для нахождения наибольшего общего делителя (GCD)
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
