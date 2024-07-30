import java.util.Random;
import java.util.Scanner;

public class p5 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Random r = new Random();
      int randomNumber = r.nextInt(100); // generate a random number between 0 and 99
      for (int i = 0; i < 5; i++) {
         System.out.println("Guess the number again:");
         int g = sc.nextInt();
         sc.nextLine();
         if (g == randomNumber) {
            System.out.println("You guessed the right number.");
            break;
         } else if (Math.abs(g - randomNumber) > 20) {
            System.out.println("You guessed very far from the number.");
         } else if (Math.abs(g - randomNumber) < 20) {
            System.out.println("You guessed very close to the number.");
         }
      }
      System.out.println("\n\nnumber guess by system is " + randomNumber);
      System.out.println("\n23DIT010_harsh donda");

   }
}