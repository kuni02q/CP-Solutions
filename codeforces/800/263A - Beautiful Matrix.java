import java.util.Scanner;

public class BeautifulMatrix_263A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][]matrix=new int[5][5];
        int column=0;
        int row =0;
        
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){

                matrix[i][j]=sc.nextInt();
                if (matrix[i][j] == 1){
                    column = i+1;
                    row = j+1;
                }
            }
        }

        System.out.println( Math.abs(column-3) + Math.abs(row-3));

    }
}
