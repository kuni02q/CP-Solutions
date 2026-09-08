import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrailingZeros {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());

        System.out.println(count(n));

    }

    static long count(long n) {
        if (n / 5 == 0) return 0;

        return n / 5 + count(n / 5);
    }

}