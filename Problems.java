import java.util.*;
public class Problems {
    //to print factorial of a number n
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int factorial = 1;
        
        if(n<0) {
            System.out.println("Invalid number");
            return;
        } else {
       for(int i =n; i>=1; i--) {
            factorial = factorial*i;
        } }
        
        
        System.out.println(factorial);
        return;

      
       }
    }
     
    

