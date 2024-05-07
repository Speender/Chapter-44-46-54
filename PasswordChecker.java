import java.util.Scanner;

public class PasswordChecker {
   public static void main(String[] agrs) {
      String password, ch;
      int upperCase = 0, lowerCase = 0, digit = 0;
      boolean notAcceptable = true;
      
      Scanner input = new Scanner(System.in);

      while (notAcceptable) {
         System.out.println("Enter your password: ");
         password = input.nextLine();
         
         if (password.length() <= 7) {
            for (int n = 0 ; n < password.length() ; n++) {
               char character = password.charAt(n);
               
               switch (character) {
                  case '1': case '2': case '3': case '4': case '5': 
                  case '6': case '7': case '8': case '9': case '0':
                  digit++;
                  break;
                     
                  default: 
                     ch = String.valueOf(character);

                     if (ch.equals(ch.toLowerCase())) 
                        lowerCase++;  
                     if (ch.equals(ch.toUpperCase()))
                        upperCase++;
               }
            }
            
            if (lowerCase != 0 && upperCase != 0 && digit != 0)
               notAcceptable = false;
            else {
               notAcceptable = true;
               System.out.println("That password is not acceptable.");
               System.out.println();
            }
         }
         else {
            notAcceptable = true;
            System.out.println("That password is not acceptable.");
            System.out.println();
         }
      } 
   
      System.out.println("Acceptable password.");
   }
}
