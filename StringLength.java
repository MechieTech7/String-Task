import java.util.Scanner;
 

public class StringLength {
    public static void main(String args[]) {
        String str;
        int length;
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Enter a String");
        str = scanner.nextLine();
        System.out.print("Length of Input String : " + str.length());
    }
}