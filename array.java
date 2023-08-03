import java.util.*;

public class  array {
    public static void main(Strings args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];

        for(int i=0; i<n; i++)  {
            for(int j =0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("the transpose is : ");

        for(int j = 0; j<m ; j++)  {
            for(int i = 0; i<n; i++) {
                System.out.print(matrix[i][j]+" ");
            }
        }
    }
}

    


    


