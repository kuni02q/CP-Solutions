import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JzzhuAndChildren_450A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int last = 0;
        int maxRound = 1;
        int thisChildRounds;

        for (int i = 0; i < n; i++) {
            int child = Integer.parseInt(st.nextToken());

            if (child%m ==0){
                thisChildRounds = child/m;
            }
            else thisChildRounds = (child  / m) +1;


            if (thisChildRounds >= maxRound) {
                last = i;
                maxRound = thisChildRounds;
            }


        }

        System.out.println(last+1);

    }
}
