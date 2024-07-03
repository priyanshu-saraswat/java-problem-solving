import java.util.Scanner;

public class Redticket {

    public static int lotteryResult(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else if (a == b && b == c) {
            return 5;
        } else if (a != b && a != c) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value for a (0, 1, or 2): ");
        int a = sc.nextInt();

        System.out.print("Enter value for b (0, 1, or 2): ");
        int b = sc.nextInt();

        System.out.print("Enter value for c (0, 1, or 2): ");
        int c = sc.nextInt();

        sc.close();

        int result = lotteryResult(a, b, c);
        System.out.println("Result for (" + a + ", " + b + ", " + c + "): " + result);
    }
}
