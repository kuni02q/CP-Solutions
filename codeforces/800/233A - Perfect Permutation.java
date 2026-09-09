import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerfectPermutation_233A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = i+1;

        }

        if (n %2 == 0){

            for (int i = 0; i < arr.length; i+=2) {

                int a = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = a;
            }

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

        }
        else System.out.println(-1);


    }
}
