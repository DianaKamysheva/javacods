package Lab3;


public class Main {
    public static void main(String[] args) {
        // Задание 1.4
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


        // Задание 1.10
        // Создание городов
        City A = new City("A");
        City B = new City("B");
        City C = new City("C");
        City D = new City("D");
        City E = new City("E");
        City F = new City("F");
        City G = new City("G");

        // Добавление маршрутов
        A.addRoute(B, 5);
        A.addRoute(D, 6);
        A.addRoute(F, 1);
        B.addRoute(A, 5);
        B.addRoute(C, 3);
        C.addRoute(B, 3);
        C.addRoute(D, 4);
        D.addRoute(C, 4);
        D.addRoute(E, 2);
        D.addRoute(A, 6);
        E.addRoute(F, 2);
        F.addRoute(E, 2);
        F.addRoute(B, 1);

        // Вывод информации о городах
        System.out.println("\nЗадание 1.10:\n");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
        System.out.println(F);
        System.out.println(G);
        System.out.println();
    }
}
