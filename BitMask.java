
public class BitMask {
    public static void main(String args[]) {

      //get bit
        int n =5; 
        int pos =2;
        int bitMask = 1<<pos;  //left shift by position times

        if((bitMask & n) == 0) {
          System.out.println("Bit was Zero");
        } else {
          System.out.println("Bit was non-zero");
        }

         //set bit
        pos =1;
        bitMask = 1<<pos;

        int newNumber = bitMask | n; 
        System.out.println(newNumber);
        
        //clear bit
        pos = 2; 
        bitMask =1<<pos;
        int notBitMask = ~(bitMask);

        int newnumber = notBitMask & n;
        System.out.println(newnumber);

        //

        }
       
}
