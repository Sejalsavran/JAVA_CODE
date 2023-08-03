import java.util.*;
public class Bits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
       int n =5;
       
       int bitMask = 1<<pos;
     int newBitMask = bitMask | n;
     System.out.println(newBitMask);

   
        }
       
}
