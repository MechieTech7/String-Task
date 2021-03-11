import java.util.Scanner;
public class StringComparision {
public static void main(String args[]){
      String str1, str2;
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter First String");
      str1 = in.nextLine();
 
      System.out.println("Enter Second String");
      str2 = in.nextLine();
 
      if(str1.compareTo(str2) > 0)
      {
         System.out.println("str1 is Greater than str2.");
      }
      else if(str1.compareTo(str2) < 0)
      {
         System.out.println("str1 is Smaller than Second str2.");
      }
      else
      {
         System.out.println("Both Strings are Equal");
      }
   }
}
