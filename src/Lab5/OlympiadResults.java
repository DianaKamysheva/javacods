package Lab5;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

class OlympiadResults {
    public static Map<String, Integer> readResults(String filename) {
        Map<String, Integer> results = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // consume newline
        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            String name = parts[0] + " " + parts[1];
            int score = Integer.parseInt(parts[2]) + Integer.parseInt(parts[3]) + Integer.parseInt(parts[4]);
            results.put(name, score);
        }
        scanner.close();
        return results;
    }

    public static void printMaxScoreParticipants(Map<String, Integer> results) {
        int maxScore = results.values().stream().max(Integer::compare).orElse(0);
        results.forEach((name, score) -> {
            if (score == maxScore) {
                System.out.println(name);
            }
        });
    }
}
