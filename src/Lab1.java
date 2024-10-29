import java.util.Scanner;


public class Lab1 {
    // Методы

    // 2. Сумма знаков
    public int sumLastNums (int x) {
        return ((x / 10)% 10) + (x % 10);
    }

    // 4. Есть ли позитив
    public boolean isPositive (int x) {
        return (x > 0);
    }

    // 6. Большая буква
    public boolean isUpperCase ( char x) {
        return (('A' <= x) && (x <= 'Z'));
    }

    // 8. Делитель
    public boolean isDivisor (int a, int b){
        return ((a % b == 0) || (b % a == 0));
    }

    // 10. Многократный вызов
    public int lastNumSum(int a, int b) {
        return ((a % 10) + (b % 10));
    }

    // Условия

    // 2. Безопасное деление
    public double safeDiv (int x, int y) {
        if (y == 0) {
            return 0;
        }
        else {
            return ((double) x / y);
        }
    }

    // 4. Строка сравнения
    public String makeDecision (int x, int y) {
        if (x > y) {
            return (x + ">" + y);
        }
        else if (x < y) {
            return (x + "<" + y);
        }
        else {
            return (x + "==" + y);
        }
    }

    // 6. Тройная сумма
    public boolean sum3 (int x, int y, int z) {
        if (x + y == z || x + z == y || y + z == x) {
            return true;
        }
        else {
            return false;
        }
    }

    // 8. Возраст
    public String age (int x) {
        if (((x % 100 >= 11) && (x % 100 <= 14)) || (x % 10 >= 5) || (x % 10 == 0)) {
            return (x + " лет");
        }
        else if (x % 10 == 1) {
            return (x + " год");
        }
        else {
            return (x + " года");
        }
    }

    // 10. Вывод дней недели
    public void printDays (String x) {
        switch (x) { // Вводим начальный день недели, далее дни недели печатаются последовательно до воскресенья
            case "Понедельник":
                System.out.println(x);
                x = "Вторник";
            case "Вторник":
                System.out.println(x);
                x = "Среда";
            case "Среда":
                System.out.println(x);
                x = "Четверг";
            case "Четверг":
                System.out.println(x);
                x = "Пятница";
            case "Пятница":
                System.out.println(x);
                x = "Суббота";
            case "Суббота":
                System.out.println(x);
                x = "Воскресенье";
            case "Воскресенье":
                System.out.println(x);
                break;
            default:
                System.out.println("это не день недели");
        }
    }

    // Циклы

    // 2. Числа наоборо
    public String reverseListNums (int x) {
        StringBuilder reversed = new StringBuilder();

        while (x >= 0) {
            reversed.append(" ").append(x);
            x--;
        }
        return reversed.toString();
    }

    // 4. Степень числа
    public int pow (int x, int y) {
        int returnedInt = 1;

        for (int i = 0; i < y; i++) {
            returnedInt *= x;
        }

        return returnedInt;
    }

    // 6. Одинаковость
    public boolean equalNum (int x) {
        if (x < 0) {
            x = -x;
        }
        int firstNum = x % 10;
        x /= 10;
        while (x > 0) {
            if (x % 10 != firstNum) {
                return false;
            }
            x /= 10;
        }
        return true;
    }

    // 8. Левый треугольник
    public void leftTriangle (int x) {
        for (int i = 1; i <= x; i++) {
            System.out.println("*".repeat(i));
        }
    }

    // 10. Угадайка
    public void guessGame() {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 10);
        int attempts = 0;

        System.out.println("Загадано число от 0 до 9. Попробуйте угадать!");

        while (true) {
            System.out.print("Введите число: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == randomNumber) {
                System.out.println("Вы угадали!");
                System.out.println("Вы отгадали число за " + attempts + " попыток.");
                break; // Завершаем цикл после угадывания
            } else {
                System.out.println("Вы не угадали, попробуйте еще раз.");
            }
        }
        scanner.close();
    }

    // Массивы

    // 2. Поиск последнего значения
    public int findLast(int[] arr, int x) {
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] == x) {
                    return i;
                }
            }
            return -1;
    }

    // 4. Добавление в массив
    public int[] add (int[] arr, int x, int pos) {
        int lenArr = arr.length;

        if (pos < 0) {
            pos = 0;
        }
        else if (pos > lenArr) {
            pos = lenArr;
        }

        int[] newArr = new int[lenArr + 1];

        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }

        newArr[pos] = x;

        for (int i = pos; i < lenArr; i++) {
            newArr[i + 1] = arr[i];
        }

        return newArr;
    }

    // 6. Реверс
    public void reverse (int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int key = arr[left];
            arr[left] = arr[right];
            arr[right] = key;
            left++;
            right--;
        }
    }

    // 8. Объединение
    public int[] concat (int[] arr1,int[] arr2) {
        int lenArr1 = arr1.length;
        int lenArr2 = arr2.length;
        int[] newArr = new int[lenArr1 + lenArr2];

        for (int i = 0; i < lenArr1; i++) {
            newArr[i] = arr1[i];
        }
        for (int i = 0; i < lenArr2; i++) {
            newArr[i + lenArr1] = arr2[i];
        }
        return newArr;
    }

    // 10. Удалить негатив
    public int[] deleteNegative (int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i >= 0) {
                count++;
            }
        }

        int[] newArr = new int[count];

        int j = 0;
        for (int i : arr) {
            if (i >= 0) {
                newArr[j] = i;
                j++;
            }
        }

        return newArr;
    }

    public static void main(String[] args) {
        Lab1 lab1 = new Lab1();
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\nВыберите задание (0 - Выход):");
            System.out.println("1 - Задание 1");
            System.out.println("2 - Задание 2");
            System.out.println("3 - Задание 3");
            System.out.println("4 - Задание 4");
            System.out.print("Введите номер задания: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Задание 1: Методы
                    System.out.println("\nЗадание 1: Методы");
                    System.out.print("Введите число для подсчета суммы последних двух цифр: ");
                    int num1 = scanner.nextInt();
                    System.out.println("Сумма последних двух знаков числа " + num1 + ": " + lab1.sumLastNums(num1));

                    System.out.print("Введите число для проверки на положительность: ");
                    int num2 = scanner.nextInt();
                    System.out.println("Число " + num2 + " положительное: " + lab1.isPositive(num2));

                    System.out.print("Введите символ для проверки на верхний регистр: ");
                    char symbol = scanner.next().charAt(0);
                    System.out.println("Символ '" + symbol + "' - большая буква: " + lab1.isUpperCase(symbol));

                    System.out.print("Введите первое число для проверки делимости: ");
                    int num3 = scanner.nextInt();
                    System.out.print("Введите второе число для проверки делимости: ");
                    int num4 = scanner.nextInt();
                    System.out.println("Числа " + num3 + " и " + num4 + " делят друг друга: " + lab1.isDivisor(num3, num4));

                    System.out.print("Введите первое число для суммирования последних цифр: ");
                    int num5 = scanner.nextInt();
                    System.out.print("Введите второе число для суммирования последних цифр: ");
                    int num6 = scanner.nextInt();
                    System.out.println("Сумма последних знаков чисел " + num5 + " и " + num6 + ": " + lab1.lastNumSum(num5, num6));
                    break;

                case 2:
                    // Задание 2: Условия
                    System.out.println("\nЗадание 2: Условия");
                    System.out.print("Введите первое число для безопасного деления: ");
                    int num7 = scanner.nextInt();
                    System.out.print("Введите второе число для безопасного деления: ");
                    int num8 = scanner.nextInt();
                    System.out.println("Безопасное деление " + num7 + " на " + num8 + ": " + lab1.safeDiv(num7, num8));

                    System.out.print("Введите первое число для сравнения: ");
                    int num9 = scanner.nextInt();
                    System.out.print("Введите второе число для сравнения: ");
                    int num10 = scanner.nextInt();
                    System.out.println("Сравнение чисел " + num9 + " и " + num10 + ": " + lab1.makeDecision(num9, num10));

                    System.out.print("Введите первое число для проверки тройной суммы: ");
                    int num11 = scanner.nextInt();
                    System.out.print("Введите второе число для проверки тройной суммы: ");
                    int num12 = scanner.nextInt();
                    System.out.print("Введите третье число для проверки тройной суммы: ");
                    int num13 = scanner.nextInt();
                    System.out.println("Тройная сумма чисел " + num11 + ", " + num12 + " и " + num13 + ": " + lab1.sum3(num11, num12, num13));

                    System.out.print("Введите возраст: ");
                    int age = scanner.nextInt();
                    System.out.println("Возраст: " + lab1.age(age));

                    System.out.print("Введите день недели для вывода: ");
                    String day = scanner.next();
                    System.out.println("Вывод дней недели, начиная с " + day + ":");
                    lab1.printDays(day);
                    break;

                case 3:
                    // Задание 3: Циклы
                    System.out.println("\nЗадание 3: Циклы");
                    System.out.print("Введите число для вывода чисел от него до 0: ");
                    int num14 = scanner.nextInt();
                    System.out.println("Числа от " + num14 + " до 0: " + lab1.reverseListNums(num14));

                    System.out.print("Введите основание степени: ");
                    int num15 = scanner.nextInt();
                    System.out.print("Введите показатель степени: ");
                    int num16 = scanner.nextInt();
                    System.out.println(num15 + " в степени " + num16 + ": " + lab1.pow(num15, num16));

                    System.out.print("Введите число для проверки на одинаковость цифр: ");
                    int num17 = scanner.nextInt();
                    System.out.println("Число " + num17 + " состоит из одинаковых цифр: " + lab1.equalNum(num17));

                    System.out.print("Введите высоту левого треугольника: ");
                    int height = scanner.nextInt();
                    System.out.println("Левый треугольник высотой " + height + ":");
                    lab1.leftTriangle(height);

                    System.out.println("Игра в угадайку:");
                    lab1.guessGame();
                    break;

                case 4:
                    // Задание 4: Массивы
                    System.out.println("\nЗадание 4: Массивы");
                    System.out.print("Введите размер массива: ");
                    int size = scanner.nextInt();
                    int[] arr1 = new int[size];
                    System.out.println("Введите элементы массива: ");
                    for (int i = 0; i < size; i++) {
                        arr1[i] = scanner.nextInt();
                    }
                    System.out.print("Введите число для поиска в массиве: ");
                    int num18 = scanner.nextInt();
                    System.out.println("Индекс последнего вхождения числа " + num18 + " в массив: " + lab1.findLast(arr1, num18));

                    System.out.println("Введите элементы массива (размер массива: 5):");
                    int[] arr2 = new int[5];
                    for (int i = 0; i < 5; i++) {
                        arr2[i] = scanner.nextInt();
                    }
                    System.out.print("Введите число для добавления в массив: ");
                    int num19 = scanner.nextInt();
                    System.out.print("Введите позицию для добавления в массив: ");
                    int pos = scanner.nextInt();
                    System.out.println("Добавление числа " + num19 + " в массив " + java.util.Arrays.toString(arr2) + " в позицию " + pos + ": " + java.util.Arrays.toString(lab1.add(arr2, num19, pos)));

                    System.out.println("Введите элементы массива (размер массива: 5):");
                    int[] arr3 = new int[5];
                    for (int i = 0; i < 5; i++) {
                        arr3[i] = scanner.nextInt();
                    }
                    System.out.println("Реверс массива " + java.util.Arrays.toString(arr3) + ": ");
                    lab1.reverse(arr3);
                    System.out.println(java.util.Arrays.toString(arr3));

                    System.out.println("Введите элементы первого массива (размер массива: 3):");
                    int[] arr4 = new int[3];
                    for (int i = 0; i < 3; i++) {
                        arr4[i] = scanner.nextInt();
                    }
                    System.out.println("Введите элементы второго массива (размер массива: 3):");
                    int[] arr5 = new int[3];
                    for (int i = 0; i < 3; i++) {
                        arr5[i] = scanner.nextInt();
                    }
                    System.out.println("Объединение массивов " + java.util.Arrays.toString(arr4) + " и " + java.util.Arrays.toString(arr5) + ": " + java.util.Arrays.toString(lab1.concat(arr4, arr5)));

                    System.out.println("Введите элементы массива (размер массива: 7):");
                    int[] arr6 = new int[7];
                    for (int i = 0; i < 7; i++) {
                        arr6[i] = scanner.nextInt();
                    }
                    System.out.println("Удаление отрицательных чисел из массива " + java.util.Arrays.toString(arr6) + ": " + java.util.Arrays.toString(lab1.deleteNegative(arr6)));
                    break;

                case 0:
                    System.out.println("Выход из программы.");
                    break;

                default:
                    System.out.println("Некорректный выбор задания.");
            }
        } while (choice != 0);

        scanner.close();
    }

}

