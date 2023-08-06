import java.util.*;
public class exercise {

public static void main(String args[]) {
    Scanner sc  =new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int n = sc.nextInt();
    int age = sc.nextInt();
 //to print average of three numbers
    int average = (a+b+c)/3;
    System.out.println(average);

    //to find sum of all odd number
    int sum = 0;
    for(int i =0; i<=n; i++) {
        if((i %2) ==1) {
            sum = sum+i;
        }
    }
     System.out.println(sum);

     // to check greater of two number(a and b)
     if(a>b) {
        System.out.println("a is greater");
     } else {
        System.out.println("b is greater");
     }

     //to find circumference of a circle (consider a as radius)
     double pi=  3.14;
      double circumference = 2*pi*a;
      System.out.println(circumference);
      

      //to check whether a person is eligible for vote or not (take age as a input from user)
      if(age>18) {
        System.out.println("Eligible for vote");
      } else {
        System.out.println("Not eligible for vote");

      }

      //to rpint infinite loop using do while condition
      int x =100;

      do{
        System.out.println("This is an infinite loop");
      }while(x>10);
}
    
}
