import java.util.Scanner;

public class ZeroFront {
    public static int[] zeroFront(int[] nums) {
        int[] result = new int[nums.length];
        int zeroIndex = 0;
        int nonZeroIndex = nums.length - 1;

        for (int num : nums) {
            if (num == 0) {
                result[zeroIndex] = 0;
                zeroIndex++;
            } else {
                result[nonZeroIndex] = num;
                nonZeroIndex--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] result = zeroFront(arr);
        
        System.out.println("Array after moving zeros to the front:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
