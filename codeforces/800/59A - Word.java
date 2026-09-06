import java.util.Scanner;

public class Word_59A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        
        int count = 0;

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                count++;
            }
            else count--;
        }

        System.out.println(count > 0 ? word.toUpperCase() : word.toLowerCase() );

    }
}
