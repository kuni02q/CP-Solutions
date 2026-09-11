import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PetrAndBook_139A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] week = new int[7];

        StringTokenizer st = new StringTokenizer(br.readLine());

        int answer = 0;

        for (int i = 0; i < week.length; i++){
            week[i] = Integer.parseInt(st.nextToken());
        }


        while (true){

            for (int i = 0; i < week.length; i++){
                n = n - week[i];

                if (n <= 0){
                    answer = i+1;
                    break;
                }

            }

            if (n <= 0){
                break;
            }

        }


        System.out.println(answer);

    }
}
