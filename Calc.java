import java.util.*;
public class Calc {
    public static void main(String args[]) {
        //taking input from user
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

    //to perform addition of two no.
        int sum = a+b;
        System.out.println(sum);

        //to perform subtraction of two no.

        int sub = a-b;
        System.out.println(sub);

        //to perform product of two no.

        int product = a*b;
        System.out.println(product);

        //to perform division of two no.

        int div = a/b;
         System.out.println(div);
    }
    
}
