package Lab3;

public class Main {
    public static void main(String[] args) {
        Lab3.Fraction f1 = new Lab3.Fraction(1, 3);
        Lab3.Fraction f2 = new Lab3.Fraction(2, 3);
        Lab3.Fraction f3 = new Lab3.Fraction(3, 2);

        System.out.println("\nЗадание 1.4:\n");
        // Примеры работы с дробными числами
        System.out.println(f1 + " + " + f2 + " = " + f1.add(f2));
        System.out.println(f1 + " - " + f2 + " = " + f1.subtract(f2));
        System.out.println(f1 + " * " + f2 + " = " + f1.multiply(f2));
        System.out.println(f1 + " / " + f2 + " = " + f1.divide(f2));
        // Примеры работы с целыми числами
        System.out.println(f1 + " + " + 5 + " = " + f1.add(5));
        System.out.println(f1 + " - " + 5 + " = " + f1.subtract(5));
        System.out.println(f1 + " * " + 5 + " = " + f1.multiply(5));
        System.out.println(f1 + " / " + 5 + " = " + f1.divide(5));

        // Вычисление выражения f1.sum(f2).div(f3).minus(5)
        Lab3.Fraction result = f1.add(f2).divide(f3).subtract(5);
        System.out.println("Искомый пример:" + f1 + " + " + f2 + " / " + f3 + " - 5 = " + result);
        System.out.println();
    }
}
