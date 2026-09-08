import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BitStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        long modulo = (long)Math.pow(10,9) + 7;

        long result = 1;
        for (int i = 0; i < n; i++) {

          result = (result * 2) % modulo;

        }

        System.out.println(result);


    }
}