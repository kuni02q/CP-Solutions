import java.util.Scanner;

public class BearAndBigBrother_791A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int weightLimak = sc.nextInt();
        int weightBob= sc.nextInt();

        int years = 0;

        while(weightBob>=weightLimak){
            weightLimak = weightLimak * 3;
            weightBob = weightBob * 2;
            years++;
        }

        System.out.println(years);

    }

}
