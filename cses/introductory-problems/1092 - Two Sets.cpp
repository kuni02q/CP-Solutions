import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TwoSets {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Integer.parseInt(br.readLine());

        long sum = n * (n + 1) / 2;

        List<Long> list1 = new ArrayList<>();
        List<Long> list2 = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        long listSum1 = 0;
        long listSum2 = 0;

        if (sum % 2 == 1) {
            sb.append("NO");
        } else {
            sb.append("YES\n");
            for (long i = n; i >= 1; i--) {

                if (listSum1 <= listSum2) {
                    list1.add(i);
                    listSum1 = listSum1 + i;
                } else {
                    list2.add(i);
                    listSum2 = listSum2 + i;
                }

            }

            sb.append(list1.size() + "\n");
            list1.forEach(i -> sb.append(i + " "));
            sb.append("\n");
            sb.append(list2.size() + "\n");
            list2.forEach(i -> sb.append(i + " "));

        }

        System.out.println(sb);


    }
    

        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Integer.parseInt(br.readLine());

        long sum = sum(n);

        List<Long> list1 = new ArrayList<>();
        List<Long> list2 = new ArrayList<>();

        StringBuilder sb = new StringBuilder();


        if(sum % 2 == 1){
            sb.append("NO");
        }
        else{
            sb.append("YES\n");
            for(long i = n; i>=1; i--){

                if(listSum(list1) <= listSum(list2)){
                    list1.add(i);
                }
                else {
                    list2.add(i);
                }

            }

            sb.append(list1.size() + "\n");
            list1.forEach(i -> sb.append(i + " "));
            sb.append("\n");
            sb.append(list2.size() + "\n");
            list2.forEach(i -> sb.append(i + " "));

        }

        System.out.println(sb);


    }



    static long sum(long n){

        if(n <= 1) return 1;

        return n + sum(n-1);

    }

    static long listSum(List<Long> list){
        long sum = 0;
        for(Long l : list){
            sum += l;
        }
        return sum;
    }
         */


}