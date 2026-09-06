import java.util.Scanner;

public class Translation_41A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        String translatedWord = sc.nextLine();

        boolean good = true;
        if (word.length() == translatedWord.length()) {
            for (int i = 0; i < word.length(); i++) {

                if (word.charAt(i) != translatedWord.charAt(translatedWord.length() - 1 - i)) {
                    good = false;
                    break;
                }

            }
        }
        else good = false;

        System.out.println(good ? "YES" : "NO");

    }
}
