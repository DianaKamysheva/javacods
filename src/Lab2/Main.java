//вариант 2
package Lab2;

public class Main {
    public static void main(String[] args) {
        // Задание 1.2
        Person cleopatra = new Person("Клеопатра", 152);
        Person pushkin = new Person("Пушкин", 167);
        Person vladimir = new Person("Владимир", 189);

        System.out.println("\nЗадание 1.2:\n");
        System.out.println(cleopatra);
        System.out.println(pushkin);
        System.out.println(vladimir);
        System.out.println();

        // Задание 1.3
        Name nameCleopatra = new Name("Клеопатра");
        Name namePushkin = new Name("Пушкин", "Александр", "Сергеевич");
        Name nameMayakovsky = new Name("Маяковский", "Владимир");

        System.out.println("\nЗадание 1.3:\n");
        System.out.println(nameCleopatra);
        System.out.println(namePushkin);
        System.out.println(nameMayakovsky);
        System.out.println();

        // Задание 2.2
        Person personCleopatra = new Person(nameCleopatra, 152);
        Person personPushkin = new Person(namePushkin, 167);
        Person personMayakovsky = new Person(nameMayakovsky, 189);

        System.out.println("\nЗадание 2.2:\n");
        System.out.println(personCleopatra);
        System.out.println(personPushkin);
        System.out.println(personMayakovsky);
        System.out.println();

        // Задание 3.3 & 4.8
        City moscow = new City("Москва");
        City saintPetersburg = new City("Санкт-Петербург");
        City kazan = new City("Казань");
        City volgograd = new City("Волгоград");

        moscow.addRoute(saintPetersburg, 500);
        moscow.addRoute(kazan, 800);
        saintPetersburg.addRoute(volgograd, 1200);

        System.out.println("\nЗадание 3.3 & 4.8:\n");
        System.out.println(moscow);
        System.out.println(saintPetersburg);
        System.out.println(kazan);
        System.out.println(volgograd);
        System.out.println();

        // Задание 5.5
        Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction(2, 3);
        Fraction f3 = new Fraction(3, 2);

        System.out.println("\nЗадание 5.5:\n");
        System.out.println(f1 + " * " + f2 + " = " + f1.multiply(f2));
        System.out.println(f1 + " + " + f2 + " = " + f1.add(f2));
        System.out.println(f1 + " - " + f2 + " = " + f1.subtract(f2));
        System.out.println(f1 + " / " + f2 + " = " + f1.divide(f2));
        System.out.println(f1 + " / " + 5 + " = " + f1.divide(5));
        System.out.println(f1 + " * " + 5 + " = " + f1.multiply(5));
        System.out.println(f1 + " + " + 5 + " = " + f1.add(5));
        System.out.println(f1 + " - " + 5 + " = " + f1.subtract(5));

        Fraction result = f1.add(f2).divide(f3).subtract(5);
        System.out.println(f1 + " + " + f2 + " / " + f3 + " - 5 = " + result);
        System.out.println();
    }
}
