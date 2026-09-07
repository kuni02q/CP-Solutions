import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int max = 1;
        int recent = 1;

        for (int i = 0; i < s.length()-1; i++) {

            if (s.charAt(i) == s.charAt(i + 1)) {
                recent++;

                if (recent > max) {
                    max = recent;
                }
            }
            else {
                recent= 1;
            }

        }

        System.out.println(max);

    }
}