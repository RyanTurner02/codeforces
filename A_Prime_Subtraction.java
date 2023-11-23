import java.util.Scanner;

public class A_Prime_Subtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            long x = scanner.nextLong();
            long y = scanner.nextLong();
            boolean flag = primeSubtract(x, y);

            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean primeSubtract(long x, long y) {
        return x - y != 1;
    }
}