import java.util.*;

class p3 {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your moabile number:-");
      String mobile = sc.nextLine();
      System.out.println("mobile system operator:-" + mobile.substring(0, 2) + "  msc number:-" + mobile.substring(2, 5)
            + "  uniqe subscriber number:-" + mobile.substring(5, 10));
      System.out.println("\n23DIT010_harsh donda");
   }
}
