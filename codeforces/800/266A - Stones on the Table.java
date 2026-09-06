import java.util.Scanner;

public class StonesOnTheTable_266A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String colors = sc.next();
        String newColors = "";

        for (int i = 0; i < colors.length()-1; i++) {

            if (colors.charAt(i) != colors.charAt(i+1)) {
                newColors += colors.charAt(i);
            }

        }
        newColors += colors.charAt(colors.length()-1);

        System.out.println(colors.length() - newColors.length());

    }
}
