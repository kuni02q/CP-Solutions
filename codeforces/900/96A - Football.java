import java.util.Scanner;

public class Football_96A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        int max = 0;
        int recent = 1;
        for (int i = 0; i < word.length()-1; i++) {

            if (word.charAt(i) == word.charAt(i+1)) {
                recent++;

                if (recent > max) {
                    max = recent;
                }
            }
            else  {
                recent = 1;
            }
        }

        System.out.println(max >= 7 ? "YES" : "NO");

    }
}
