import java.util.Scanner;

public class Elephant_617A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int distance = sc.nextInt();
        int remnant = distance % 5;
        int steps = distance / 5;

        System.out.println(remnant==0 ? steps : steps + 1);

    }
}
