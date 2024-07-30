import java.util.*;

class p2 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      char arr[] = { 'a', 'b', 'c' };
      String[] arr2 = { "..-", ".-.", "-.." };
      System.out.println("::::options::::");
      System.out.println("1.english to morse");
      System.out.println("2.morse to english");
      System.out.println("::::options::::");
      System.out.println("Ennter your choice:-");
      int n = sc.nextInt();
      sc.nextLine();
      switch (n) {
         case 1:
            System.out.println("Enter a english word to convert in mourse code:-");
            String x1 = sc.nextLine();
            for (int i = 0; i < x1.length(); i++) {
               char x = x1.charAt(i);
               for (int j = 0; j < arr.length; j++) {
                  if (x == arr[j]) {
                     System.out.print(arr2[j]);
                  }
               }

            }
            break;
         case 2:
            System.out.println("Enter a morse code to convert in english word code:-");
            String x2 = sc.nextLine();
            for (int i = 0; i < x2.length() / 3; i++) {
               String x = x2.substring(i * 3, i * 3 + 3);
               for (int j = 0; j < arr2.length; j++) {
                  if (x.equals(arr2[j])) {
                     System.out.print(arr[j]);
                  }
               }
            }
      }
      System.out.println("\n23DIT010_harsh donda");
   }
}