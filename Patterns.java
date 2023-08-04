public class Patterns {
    public static void main(String args[]) {
        int n =4;
        int m = 5;
        //to print a rectangle of n rows and m columns

       //outer loop(for rows)
        for(int i =0; i<n; i++) {
           //inner loop (for columns)
            for(int j =0; j<m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

     //to print a hollow rectangle
     //outer loop
        for(int i = 0; i<n; i++) {
            //inner loop
                for(int j =0; j<m; j++) {
                     if(i == 0 || i == n-1 || j == 0 || j==m-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
        //to print lower triangle
        //outer loop
        for(int i =0; i<n; i++) {
            //inner loop
            for(int j =0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //to print upper triangle
        //outer loop
        for(int i=n; i>=1; i--) {
            //inner loop
            for(int j = 1; i<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //to print lower inverted triangle
        //outer looop
        for(int i =n; i>=0;i--) {
            //inner loop
            for(int j =0; j<i; j++) {
                System.out.print(" ");
            }
            for(int j =0; j<n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //to print lower triangle with numbers
        //outer loop
        for(int i = 1; i<=m; i++) {
            //inner loop
            for(int j =1; j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        //to print upper triangle with numbers
        //outer loop
           for(int i = m; i>=1; i-- ) {
            for(int j = 1; i<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
           }

        //to print a triangle with number after incrementing 
        int number =1;

        for(int i =1; i<=n; i++) {
            for(int j =1; j<=i; j++) {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }

        //to print a tringle with 0 and 1 alternatively

        for(int i =1; i<=n; i++) {
            for(int j =1; j<=i; j++) {
                if((i+j) % 2 == 0) {
                    System.out.print(1+" ");
                } else {
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
        //to print a rhombus

        for(int i =1; i<=m; i++) {
            //to print spaces
            for(int j =1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //stars
            for(int j =1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
