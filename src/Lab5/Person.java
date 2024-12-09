package Lab5;
//7.2
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Scanner;

class Person {
    private String name;
    private int number;

    public Person(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
}

class PersonProcessor {
    public static Map<Integer, List<String>> processPersons(String filename) {
        Scanner scanner = new Scanner(System.in);
        List<String> lines = new ArrayList<>();
        while (scanner.hasNextLine()) {
            lines.add(scanner.nextLine());
        }
        scanner.close();

        return lines.stream()
                .map(line -> line.split(":"))
                .filter(parts -> parts.length == 2 && !parts[1].trim().isEmpty())
                .map(parts -> new Person(parts[0].trim(), Integer.parseInt(parts[1].trim())))
                .collect(Collectors.groupingBy(
                        Person::getNumber,
                        Collectors.mapping(Person::getName, Collectors.toList())
                ));
    }
}
