import java.util.Scanner;

public class AntonAndDanik_734A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        int count = 0;

        for (int i = 0; i < n; i++) {

            if (s.charAt(i) == 'A') count++;
            else count--;
        }

        if (count == 0) {
            System.out.println("Friendship");
        } else if (count > 0) {
            System.out.println("Anton");
        }
        else  {
            System.out.println("Danik");
        }

    }
}
