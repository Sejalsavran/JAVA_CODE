import java.util.*;
class Conditions
{
    ;public static void main(String args[]) {

    //taking input from user
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();

    //two print weather a person is child, teenager or adult
    if(age<=12) {
      System.out.println("Child");
    } else if(age>12 && age<=18){
      System.out.println("Teenager");
    } else {
      System.out.println("Adult");
    }

    }
}



