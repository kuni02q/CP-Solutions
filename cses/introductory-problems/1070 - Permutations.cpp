import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        StringBuilder s = new StringBuilder();

        for (int i = 2; i <= n; i += 2) {
            s.append(i).append(" ");
        }

        for (int i = 1; i <= n; i += 2) {
            s.append(i).append(" ");
        }


        System.out.println(n == 2 || n == 3 ? "NO SOLUTION" : s.toString());

    }

}