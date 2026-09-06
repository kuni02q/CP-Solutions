import java.util.Scanner;

public class Team_231A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String line;
        int count = 0;
        
        for (int i = 0; i <= num; i++) {
            line = sc.nextLine();

            if(line.chars().filter(c->c=='1').count()>1) count++;
        }

        System.out.println(count);


    }

}
