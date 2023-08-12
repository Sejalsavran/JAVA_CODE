public class Recursion1 {

    public static void printSum(int i, int n,  int sum) {
        //to print sum of n natural number
        if(i==n) { 
            sum+=i;
            System.out.println(sum);  //base case
            return;
        }
        sum+=i;
        printSum(i+1, n, sum);
        System.out.println(i);

        
    }
    public static void main(String args[]) {
       
       printSum(1, 5, 0);
    }
    
}
