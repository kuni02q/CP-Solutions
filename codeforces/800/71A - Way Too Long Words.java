import java.util.Scanner;

public class WayTooLongWords_71A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String word;

        for (int i = 0; i < num; i++) {

            word = sc.next();
            int length = word.length();

            System.out.println( length <11 ? word : "" + word.charAt(0) + (length-2) + word.charAt(length-1) );
        }

    }

}
