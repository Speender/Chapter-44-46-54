import java.io.*;
import java.util.Scanner;

public class DocumentationPrinter {
   public static void main(String[] args) throws IOException {
      
      File myFile = new File("C:\\Users\\ACER\\Comprog12\\Diether_Catan_Gwapa_Kaayo.txt");

      Scanner input = new Scanner(myFile);
      String line = input.next();
      
      while (input.hasNextLine()) {
         if (line.startsWith("//"))
            System.out.println(line);
            
            line = input.nextLine();
      }
   }
}
