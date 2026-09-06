import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HelpfulMaths_339A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        List<Integer> numsList = new ArrayList<>();

        for (int i = 0; i <= input.length(); i+=2) {
            numsList.add(Integer.parseInt(input.charAt(i)+""));
        }

        numsList = numsList.stream().sorted().toList();

        for (int i = 0; i < numsList.size()-1; i++) {
            System.out.print(numsList.get(i) + "+");
        }
        
        System.out.print(numsList.getLast());

    }

}
