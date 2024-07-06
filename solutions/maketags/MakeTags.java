import java.util.Scanner;

public class MakeTags {

    public static String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the HTML tag: ");
        String tag = sc.nextLine();

        System.out.print("Enter the word: ");
        String word = sc.nextLine();

        String result = makeTags(tag, word);
        System.out.println("The result is: " + result);

    }
}
