import java.util.Scanner;

public class PetyaAndStrings_112A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String first = sc.nextLine().toLowerCase();
        String second = sc.nextLine().toLowerCase();
        int count = 0;

        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                count = count + (first.charAt(i) - second.charAt(i));
                break;
            }
        }

        if (count < 0) {
            System.out.println(-1);
        } else if (count == 0) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }


}
