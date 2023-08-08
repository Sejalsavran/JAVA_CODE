import java.util.*;
import java.util.*;
public class calculator {
    private static final int N12 = 0;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char operator;
        int N1,N2,result;

        System.out.println("choose operator");
        operator = sc.next().charAt(0);

        System.out.println("enter first number");
        N1 = sc.nextInt();

        System.out.println("enter second number");
        N2 = sc.nextInt();

        switch(operator) {
            case '+' : 
            result = N1+N2;
            System.out.println(result);
             break;
            case '-' : 
            result = N1-N2;
            System.out.println(result);
             break;
            case '*' : 
            result = N1 * N2;
            System.out.println(result);
             break;
            case '/' : 
            result = N1/N2;
            System.out.println(result);
             break;
            default:
            System.out.println("invalid operator");
             break;
        }

        
        }

    }
    

