import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class NumberSpiral {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long y = Long.parseLong(st.nextToken());
            long x = Long.parseLong(st.nextToken());

            long maxNum = Math.max(y, x);

            long answer = (maxNum - 1) * (maxNum - 1);

            if (maxNum % 2 == 0) {
                if (y == maxNum) {
                    sb.append(answer + (2 * maxNum - x));
                } else {
                    sb.append(answer + y);
                }
            } else {
                if (x == maxNum) {
                    sb.append(answer + (2 * maxNum - y));
                } else {
                    sb.append(answer + x);
                }
            }
            sb.append('\n');

        }

        System.out.println(sb);


        /*
        List<Long> list = new ArrayList<>();

        for (int i = 0; i < t; i++) {

            y = sc.nextInt();
            x = sc.nextInt();
            list.clear();

            int numMax = Math.max(y, x);
            int numMin = Math.min(y, x);

            for (int j = (numMax - 1) * (numMax - 1) + 1; j <= numMax * numMax; j++) {
                list.add((long) j);

            }

            if (numMax % 2 == 0) {
                if (y > x) {
                    System.out.println(list.get(list.size() - numMin));
                } else {
                    System.out.println(list.get(numMin - 1));
                }
            } else {
                if (y > x) {
                    System.out.println(list.get(numMin - 1));
                } else {
                    System.out.println(list.get(list.size() - numMin));
                }
            }

        }
         */

    }
}