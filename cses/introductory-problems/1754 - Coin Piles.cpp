import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CoinPiles {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        long n = Long.parseLong(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long leftPile = Long.parseLong(st.nextToken());
            long rightPile = Long.parseLong(st.nextToken());


            if ((leftPile + rightPile) % 3 == 0 && leftPile > 0 && rightPile > 0) {
                if (leftPile > rightPile) {
                    if ((double)leftPile / rightPile <= 2) {
                        sb.append("YES\n");
                    } else sb.append("NO\n");
                } else {
                    if ((double)rightPile / leftPile <= 2) {
                        sb.append("YES\n");
                    } else sb.append("NO\n");
                }
            } else if (leftPile == 0 && rightPile == 0) {
                sb.append("YES\n");

            } else sb.append("NO\n");


        }

        System.out.println(sb);

    }
}