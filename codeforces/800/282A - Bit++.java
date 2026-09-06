import java.util.Scanner;

public class BitPlusPlus_282A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int x = 0;

        for (int i = 0; i < num; i++) {
            x = sc.next().contains("+") ? x+1 : x-1;
        }

        System.out.println(x);

    }
}
