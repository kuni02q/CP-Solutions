import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DimaAndFriends_272A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int sum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(st.nextToken());
        }

        int good = 0;

        for (int i = 1; i < 6; i++) {

            int num = (sum+i) % (n+1);
            if (num != 1) {
                good++;
            }

        }


        System.out.println(good);


    }
}
