import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UltraFastMathematician_61A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line1 = br.readLine();
        String line2 = br.readLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < line1.length(); i++) {

            if (line1.charAt(i) == '1' && line2.charAt(i) != '1' || line2.charAt(i) == '1' && line1.charAt(i) != '1') {
                sb.append(1);
            }
            else sb.append(0);
        }

        System.out.println(sb);

    }
}
