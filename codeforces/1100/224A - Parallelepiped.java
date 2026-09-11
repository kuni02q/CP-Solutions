import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Parallelepiped_224A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int ab = Integer.parseInt(st.nextToken());
        int ac = Integer.parseInt(st.nextToken());
        int cb = Integer.parseInt(st.nextToken());

        double a = Math.sqrt((double) (ab * ac) / cb);
        double b = Math.sqrt((double) (ab * cb) / ac);
        double c = Math.sqrt((double) (ac * cb) / ab);

        System.out.println( (int)(4 * (a + b + c)));


    }
}
