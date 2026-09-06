import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BeautifulYear_271A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        String stringYear;

        while(true){

            year++;
            stringYear = ""+year;

            Set<Character> set = new HashSet<Character>();

            for (char c : stringYear.toCharArray()) {
                set.add(c);
            }

            if(set.size()==4){
                break;
            }

        }

        System.out.println(year);

    }
}
