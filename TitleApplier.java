import java.util.Scanner;

public class TitleApplier {
   public static void main(String[] args) {
      String name;
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter a name: ");
      name = input.nextLine().trim();
      
      while (!name.equals("")) {
         if (name.startsWith("Amy") || name.startsWith("Buffy") || name.startsWith("Cathy"))
            System.out.println("Ms. " + name);
         else if (name.startsWith("Elroy") || name.startsWith("Fred") || name.startsWith("Graham"))
            System.out.println("Mr. " + name);
         else
            System.out.println(name);  
                 
         System.out.println("\nEnter a name: ");
         name = input.nextLine().trim();
      }
   }
}
