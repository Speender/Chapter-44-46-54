import java.io.*;
import java.util.Scanner;

public class BetterDocumentationPrinter {
   public static void main(String[] args) throws IOException {
      
      File myFile = new File("C:\\Users\\ACER\\Comprog12\\BetterDocumentationPrinter.java");//i change sa imong file address

      Scanner input = new Scanner(myFile);
      String line = input.next().trim();
      
      int space = 0;
   
      while (input.hasNextLine()) {
         
         if (line.startsWith("//") || (line.startsWith("/*") && line.endsWith("*/"))) {
            System.out.println(line);
            space = 0;
         }
         else {
            space++;
            if (space == 1)
               System.out.println();
         }
            
         line = input.nextLine().trim();
      }
   }
}
