import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Reconnaissance2_34A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] soldiers = new int[n];
        int minimum = 1000;

        String answer = "";

        for (int i = 0; i < n; i++) {
            soldiers[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < soldiers.length; i++) {
            int recent;
            if (i == soldiers.length-1){
                recent = Math.abs(soldiers[i] - soldiers[0]);
            }
            else recent = Math.abs(soldiers[i] - soldiers[i+1]);

            if (recent < minimum) {
                minimum = recent;
                answer = i != soldiers.length-1 ?  (i+1) + " " + (i+1 +1) : (i + 1) + " " + (0 + 1);
            }

        }

        System.out.println(answer);

    }
}
