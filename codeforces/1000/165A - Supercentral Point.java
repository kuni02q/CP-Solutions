import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;

public class SupercentralPoint_165A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Point> points = new ArrayList<Point>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            points.add(new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }


        boolean top, bottom, left, right;
        int good = 0;

        for (int i = 0; i < points.size(); i++) {
            top = false;
            bottom = false;
            left = false;
            right = false;
            for (int j = 0; j < points.size(); j++) {

                if (points.get(i).y == points.get(j).y && points.get(i).x > points.get(j).x) {
                    right = true;
                }
                if (points.get(i).y == points.get(j).y && points.get(i).x < points.get(j).x) {
                    left = true;
                }
                if (points.get(i).y < points.get(j).y && points.get(i).x == points.get(j).x) {
                    bottom = true;
                }
                if (points.get(i).y > points.get(j).y && points.get(i).x == points.get(j).x) {
                    top = true;
                }

                if (top && bottom && left && right) {
                    good++;
                    break;
                }

            }
        }

        System.out.println(good);

    }
}
