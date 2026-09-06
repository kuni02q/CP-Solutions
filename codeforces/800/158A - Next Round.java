import java.util.Scanner;

public class NextRound_158A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String l = sc.nextLine();
        int n = Integer.parseInt(l.split(" ")[0]);
        int k = Integer.parseInt(l.split(" ")[1]);

        String[] lista = sc.nextLine().split(" ");
        int count = 0;

        for (int i = 0; i < n; i++) {
            if(Integer.parseInt(lista[i]) >= Integer.parseInt(lista[k-1]) && Integer.parseInt(lista[i]) >0){
                count ++;
            }
            else{
                break;
            }
        }

        System.out.println(count);

    }
}
