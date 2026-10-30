import java.util.*;

public class Calculator{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a,b;
    System.out.println("Enter the first number:");
    a=sc.nextInt();
     System.out.println("Enter the second number:");
     b=sc.nextInt();
      System.out.println("Addition="+(a+b));
       System.out.println("Subtraction="+(a-b));
        System.out.println("Multiplication="+(a*b));
        if(b!=0){
         System.out.println("Division="+(a/b));
          System.out.println("Modulus="+(a%b));;

  }else{
     System.out.println("Division is not possible");
      System.out.println("Modulus is not possible");
  }
  sc.close();
  }
}