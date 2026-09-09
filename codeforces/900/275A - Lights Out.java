import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class LightsOut_275A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] input = new int[5][5];
        int[][] answer = new int[3][3];


        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            input[i + 1][1] = Integer.parseInt(st.nextToken());
            input[i + 1][2] = Integer.parseInt(st.nextToken());
            input[i + 1][3] = Integer.parseInt(st.nextToken());

            Arrays.fill(answer[i], 1);
        }

        for (int i = 1; i < input.length - 1; i++) {
            for (int j = 1; j < input[i].length - 1; j++) {
                int sum = input[i][j] + input[i-1][j] + input[i+1][j] + input[i][j+1] + input[i][j-1];

                if (sum % 2 == 1) {
                    answer[i - 1][j - 1] = 0;
                }

            }
        }


        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer.length; j++) {
                System.out.print(answer[i][j]);
            }
            System.out.println();
        }

    }
}
