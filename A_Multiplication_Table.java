import java.util.Scanner;

public class A_Multiplication_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int x = scanner.nextInt();

        int left = 1;
        int right = n;
        int counter = 0;

        while (left <= right) {
            int product = left * right;

            if (product == x) {
                if (left == right) {
                    counter++;
                    break;
                } else {
                    counter += 2;
                    left++;
                }
            } else if (product > x) {
                right--;
            } else if (product < x) {
                left++;
            }
        }
        System.out.println(counter);
    }
}