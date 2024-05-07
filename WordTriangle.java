import java.util.Scanner;

public class WordTriangle {
   public static void main(String[] args) {
      String word;
      int num;
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a word --> ");
      word = input.nextLine().trim();
      
      num = word.length()/2 + 1;
      
      for (int x = 0 ; x < num ; x++) {
         for (int y = 0; y <= x ; y++) {
            if (y != 0)
               System.out.print(" ");
         }
         
         System.out.println(word.substring(x, word.length()-x));   
      }
   }
}
