import java.util.Scanner;

public class charAtMethod {
   public static void main(String[] args) {
      String string;
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter a string: ");
      string = input.nextLine().trim();
      
      System.out.println();
      
      for (int inx = 0 ; inx < string.length() ; inx++)
         System.out.println(string.charAt(inx));           
   }
} 
