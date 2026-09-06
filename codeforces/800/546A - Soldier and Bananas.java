import java.util.Scanner;

public class SoldierAndBananas_546A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt(); //first banana price
        int n = sc.nextInt(); // money
        int w = sc.nextInt(); //bananas

        int totalCost = 0;
        for (int i = 1; i <= w; i++) {
            totalCost += i*k;
        }

        System.out.println(totalCost>n ? totalCost-n : 0);
        
    }

}
