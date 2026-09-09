import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PanoramixPrediction_80A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int nextPrime = n+1;

        while (true){

            boolean isPrime = true;

            for (int i = 2; i < nextPrime; i++) {
                if (nextPrime % i == 0) {
                    isPrime = false;
                }
            }

            if (isPrime){
                break;
            }
            nextPrime = nextPrime + 1;

        }

        System.out.println(nextPrime == m ? "YES" : "NO");


    }
}
