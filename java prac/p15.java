import java.util.*;

public class p15 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int leng, bridth;
      System.out.println("Enter a length:-");
      leng = sc.nextInt();
      System.out.println("Enter a bridth:-");
      bridth = sc.nextInt();
      area o;
      o = new area(leng, bridth);
      System.out.println("Area of rectangle is:-" + o.returnarea());
      System.out.println("\n23DIT010_harsh donda");

   }
}

class area {
   int area;

   area(int length, int bridth) {
      area = length * bridth;
   }

   int returnarea() {
      return area;
   }
}
