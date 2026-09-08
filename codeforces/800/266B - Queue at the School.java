import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class QueueAtTheSchool_266B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        char[] line = br.readLine().toCharArray();

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < n-1; j++) {

                if (line[j] == 'B' && line[j+1] == 'G'){
                    line[j] = 'G';
                    line[j+1] = 'B';
                    j++;
                }
            }

        }

        StringBuilder sb = new StringBuilder();
        sb.append(line);

        System.out.println(sb);



    }
}
