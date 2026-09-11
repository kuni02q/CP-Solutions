import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class EffectiveApproach_227B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Map<Integer, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            map.put(Integer.parseInt(st.nextToken()),i);
        }

        int k = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());


        long leftCount = 0;
        long rightCount = 0;

        for (int i = 0; i < k; i++) {
            int num = Integer.parseInt(st.nextToken());


            leftCount = leftCount + map.get(num) + 1;
            rightCount = rightCount + (n - map.get(num));

        }
        System.out.println(leftCount + " " + rightCount);


    }
}
