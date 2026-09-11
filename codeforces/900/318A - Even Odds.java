import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EvenOdds_318A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Long.parseLong(st.nextToken());
        long k = Long.parseLong(st.nextToken());

        if (k <= (n + 1) / 2) {
            System.out.println(k * 2 - 1);
        } else {
            if (n % 2 == 0) {
                System.out.println(k * 2 - n);
            } else {
                System.out.println(k * 2 - n - 1);
            }
        }


    }
}
