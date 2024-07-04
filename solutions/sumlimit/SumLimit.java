import java.util.Scanner;

public class SumLimit {

    public static int sumLimit(int a, int b) {
        int sum = a + b;

        int aDigits = String.valueOf(a).length();
        int sumDigits = String.valueOf(sum).length();
        
        if (sumDigits == aDigits) {
            return sum;
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first non-negative integer (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the second non-negative integer (b): ");
        int b = scanner.nextInt();

        int result = sumLimit(a, b);
        System.out.println("The result is: " + result);

    }
}
