import java.util.*;

public class stringP {
    public static void main(String args[]) {
  //to display username through email given by user by deleting the part that comse after@

   Scanner sc =  new Scanner(System.in);
    String email = sc.next();
    String userName = ""; //intialization of userName
    
    for(int i =0; i<email.length(); i++){
        if(email.charAt(i) =='@') {
            break;
        } else {
            userName += email.charAt(i);
        }
   }
    System.out.println(userName);
   Scanner sc = new Scanner(System.in);
   String str = sc.next();

   String result ="";

   for(int i = 0; i<str.length(); i++) {

    if(str.charAt(i) == 'e') {

    result+='i';

   } else {
      result += str.charAt(i);
   }
       
    }
    System.out.println(result);

    
    
}
}
