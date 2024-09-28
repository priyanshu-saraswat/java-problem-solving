import java.util.Scanner;

public class maxMirror {

    public static int maxMirror(int[] nums) {
        int maxLen = 0;
        int len = nums.length;

        for (int start = 0; start < len; start++) {
            for (int end = len - 1; end >= 0; end--) {
                int count = 0;
                int i = start;
                int j = end;
                
                while (i < len && j >= 0 && nums[i] == nums[j]) {
                    count++;
                    i++;
                    j--;
                }

                maxLen = Math.max(maxLen, count);
            }
        }

        return maxLen;
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

        int result = maxMirror(arr);

        System.out.println("Size of the largest mirror section: " + result);
    }
}
