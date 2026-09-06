import java.util.Scanner;

public class NearlyLuckyNumber_110A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '4' || s.charAt(i)=='7') {
                count++;
            }
        }
        
        System.out.println(count == 4 || count == 7 ? "YES" : "NO");
    }
}
