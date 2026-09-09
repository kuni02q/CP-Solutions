import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class YoungPhysicist_69A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());


        int x = 0;
        int y =0;
        int z = 0;

        for (int i = 0; i < n; i++) {

        StringTokenizer st = new StringTokenizer(br.readLine());
            x+= Integer.parseInt(st.nextToken());
            y+= Integer.parseInt(st.nextToken());
            z+= Integer.parseInt(st.nextToken());

        }

        System.out.println(x == 0 && y == 0 && z == 0 ? "YES" : "NO");

    }
}
