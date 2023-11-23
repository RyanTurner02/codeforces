import java.util.Scanner;
import java.math.BigInteger;

public class A_Again_Twenty_Five {

    // All numbers for 5^n where n >= 2 ends in 25
    // 5^2 = 25
    // 5^3 = 125
    // 5^4 = 625
    // 5^5 = 3125
    // ...
    // 5^n = ...25
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger n = new BigInteger(scanner.nextLine());
        System.out.println(25);
    }
}