import java.util.*;


public class Strings {
    public static void main(String args[]) {
        //Taking input as a name from user
     Scanner sc = new Scanner(System.in);
     String name = sc.next();

     //to print name given by user
     System.out.println(name);

     //concatenation
     String firstName = "sejal";
     String lastName = "savran";

     String fullName = firstName+" "+lastName;

     System.out.println(fullName);
     
     //to find length of a String

     System.out.println(fullName.length());
    
     //to acess all Charaters of a String

     for(int i =0; i<fullName.length(); i++) {
        System.out.println(fullName.charAt(i));
     }
     
     //Compare Two strings
     if(firstName.equals(lastName)) {
        System.out.println("They are the same string");
     } else {
        System.out.println("They are Different Strings");
     }

     //To Print subString of a string

     System.out.println(fullName.substring(0,5));
}
}
