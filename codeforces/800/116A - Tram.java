import java.util.Scanner;

public class Tram_116A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {

            count = count - sc.nextInt();

            count = count + sc.nextInt();

            if(count>max){
                max = count;
            }
        }

        System.out.println(max);

    }
}
