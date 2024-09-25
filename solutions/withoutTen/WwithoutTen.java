import java.util.Scanner;

public class WithoutTen {
    public static int[] withoutTen(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;

        for (int num : nums) {
            if (num != 10) {
                result[index] = num;
                index++;
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

        int[] result = withoutTen(arr);
        
        System.out.println("Array after removing 10's:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
