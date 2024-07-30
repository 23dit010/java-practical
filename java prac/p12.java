import java.util.*;

public class p12 {
   public static int poun(int p) {
      return (p * 100);
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int pound;
      int ruppes;
      System.out.println("Enter the amount in pounds:");
      pound = sc.nextInt();
      sc.nextLine();
      ruppes = poun(pound);
      System.out.println("The amount in rupees is:" + ruppes);
      System.out.println("\n23DIT010_harsh donda");
   }
}
