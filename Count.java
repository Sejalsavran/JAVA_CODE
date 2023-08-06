import java.util.*;


public class Count {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in );
          
            int num;
          int  countPositive = 0;
          int  countNegative = 0 ;
          int  countZero =0;
            char choice;
            do{
                System.out.print("Enter the number");
                num = sc.nextInt();

                if(num > 0) {
                    countPositive++;
                } else if(num < 0) {
                    countNegative++;
                } else {
                    countZero++;
                }
                System.out.print("Do you want to continue y/n");
                choice = sc.next().charAt(0);
            }while(choice == 'y' || choice == 'Y');
            System.out.println("Positive numbers" + countPositive);
            System.out.println("Negative numbers" + countNegative);
            System.out.println("Zero numbers" + countZero);
        }
    }
    

