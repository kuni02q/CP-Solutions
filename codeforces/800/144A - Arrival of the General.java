import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArrivalOfTheGeneral_144A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = 100;
        int max = 0;
        int minIndex = n;
        int maxIndex = 0;

        for (int i = 0; i < n; i++) {

            int x = Integer.parseInt(st.nextToken());

            if (x <= min){
                min = x;
                minIndex = i;
            }
            if (x > max){
                max = x;
                maxIndex = i;
            }

        }

        if (minIndex < maxIndex){
            System.out.println((n-minIndex) + maxIndex -1 -1);
        }
        else System.out.println((n-minIndex) + maxIndex -1);


    }
}
