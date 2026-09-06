import java.util.Scanner;

public class WordCapitalization_281A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        

        System.out.println(word.substring(0, 1).toUpperCase() + word.substring(1));

    }

}
