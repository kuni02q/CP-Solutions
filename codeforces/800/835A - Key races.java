import java.util.Scanner;

public class KeyRaces_835A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();

        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();

        int firstTime=s*v1 + 2*t1;
        int secondTime=s*v2 + 2*t2;

        System.out.println( firstTime < secondTime ? "First" : firstTime > secondTime ? "Second" : "Friendship" );


    }
}
