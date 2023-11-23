import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class A_Pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Character> letters = new HashSet<>();

        int n = Integer.parseInt(scanner.nextLine());
        String str = scanner.nextLine().toLowerCase();

        for (int i = 0; i < n; i++) {
            char current = str.charAt(i);

            if (!letters.contains(current)) {
                letters.add(current);
            }

            if (letters.size() >= 26) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}