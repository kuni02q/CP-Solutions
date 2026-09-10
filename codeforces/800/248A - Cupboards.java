import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Cupboards_248A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int leftOne = 0;
        int leftZero = 0;
        int rightOne = 0;
        int rightZero = 0;


        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            if (st.nextToken().equals("1")) {
                leftOne++;
            } else leftZero++;

            if (st.nextToken().equals("1")) {
                rightOne++;
            } else rightZero++;

        }

        System.out.println((n - Math.max(leftOne, leftZero) + (n - Math.max(rightOne, rightZero))));


    }
}
