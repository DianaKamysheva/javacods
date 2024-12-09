package Lab5;
//
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

class UnusedConsonants {
    public static Set<Character> findUnusedConsonants(String filename) {
        Set<Character> allConsonants = new HashSet<>();
        allConsonants.add('к');
        allConsonants.add('п');
        allConsonants.add('с');
        allConsonants.add('т');
        allConsonants.add('ф');
        allConsonants.add('х');
        allConsonants.add('ц');
        allConsonants.add('ч');
        allConsonants.add('ш');
        allConsonants.add('щ');

        Set<Character> usedConsonants = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String word = scanner.next();
            for (char c : word.toCharArray()) {
                if (allConsonants.contains(c)) {
                    usedConsonants.add(c);
                }
            }
        }
        scanner.close();

        allConsonants.removeAll(usedConsonants);
        return allConsonants;
    }
}
