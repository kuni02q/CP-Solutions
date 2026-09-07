import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;
        int realSum = 0;

        for (int i = 1; i < n; i++) {
            sum += i;
            realSum += sc.nextInt();
        }
        sum+=n;

        System.out.println(sum - realSum);


    }
}