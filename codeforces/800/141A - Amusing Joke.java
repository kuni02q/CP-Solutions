import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AmusingJoke_141A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] s = br.readLine().toCharArray();
        char[] s2 = br.readLine().toCharArray();

        List<Character> both =new ArrayList<>();
        for( char c : br.readLine().toCharArray()) {
            both.add(c);
        }


        List<Character> list = new ArrayList<>();


        for (int i = 0; i < s.length; i++) {
            list.add(s[i]);
        }
        for (int i = 0; i < s2.length; i++) {
            list.add(s2[i]);
        }

        Collections.sort(both);
        Collections.sort(list);

        boolean good = true;

        if (list.equals(both)) {
            System.out.println("YES");
        }
        else System.out.println("NO");





    }
}
