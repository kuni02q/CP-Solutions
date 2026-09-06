import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VanyaAndFence_677A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //number of friends
        int h = sc.nextInt(); //fence height
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int w = 0;

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) > h) {
                w+=2;
            }
            else w+=1;
        }

        System.out.println(w);


    }
}
