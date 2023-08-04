import java.util.*;
public class loops {
    public static void main(String args[]) {
       // for loop to print number from 1 to 20
        for(int i = 0; i<=20; i++) {
           System.out.println(i);
        }

        //while loop to print numbers from 1 to 20
        int k = 1 ;
        while(k<=20) {
            System.out.println(k);
            k++;

            
        }
        //do while loop to print numbers from 1 to 20
            int j = 0;
            do{
                System.out.println(j);
                j++;
            } while(j<=20);
             
          //to print even numbers till n
          int n =30;
          for(int i =1; i<=n; i++) {
            if( i%2 == 0) {
                System.out.println(i);
            }
          }
                    
          //to run loop till infinity times
          for(; ;) {
            System.out.println("sejal");
          }
    }
}
    
