import java.util.Scanner;

public class A_Hungry_Student_Problem {
    private static final int[] portions = { 3, 7 };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        while (n-- > 0) {
            int x = scanner.nextInt();

            while (true) {
                if (x % portions[0] == 0 || x % portions[1] == 0) {
                    System.out.println("YES");
                    break;
                }

                if (x > portions[1]) {
                    x -= portions[1];
                } else if (x > portions[0]) {
                    x -= portions[0];
                } else {
                    System.out.println("NO");
                    break;
                }
            }
        }
    }
}