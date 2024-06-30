import java.util.Scanner;

class sleepIn {
    static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Is it weekday ? ");
        boolean weekday = sc.nextBoolean();
        System.out.println("Are you on vacation ?");
        boolean vacation = sc.nextBoolean();
        boolean result = sleepIn(weekday, vacation);
        System.out.println("Can you sleep in? " + result);
        sc.close();
    }
}
