import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoKnights {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Integer.parseInt(br.readLine());

        for (long k = 1; k <= n; k++) {
            System.out.println((k * k * (k * k - 1) / 2) - ((k - 1) * (k - 2) * 2*2));
            // összes mező = (k^2 * (k^2-1) / 2) pl 4x4-esnél (4^2 * (4^2-1)/2)
            // aztán ki kell vonni azokat ahol ütik egymást. 2x3-as és 3x2-es mezőkön kétféleképpen ütik egymást
            // 2x3-as mezőből van ((k-1) * (k-2)), 3x2-es mezőből ((k-2) * (k-1))

        }

    }
}