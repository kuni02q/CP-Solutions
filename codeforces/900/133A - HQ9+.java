import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HQ9Plus_133A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        char[] arr = {'H', 'Q', '9'};
        boolean good = false;

        for (char c: arr){
            if (s.contains(String.valueOf(c))){
                good = true;
                break;
            }
        }

        System.out.println(good ? "YES" : "NO");

    }
}
