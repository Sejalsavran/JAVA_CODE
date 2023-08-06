import java.util.Scanner;

public class table {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        
        for(int i =1; i<=10; i++) {
           int table = n*i;
            System.out.println(table);
        }

        //to check if a number is even or odd
        if(n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");

        }

    }
    
}
