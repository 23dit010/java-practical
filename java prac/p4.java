import java.util.*;

class p4 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      float sum = 0f;
      char h;
      int a = 0, b = 0, c = 0, d = 0;
      do {
         System.out.println("::::option::::");
         System.out.println("1. Motor");
         System.out.println("2. Fan");
         System.out.println("3. Tube");
         System.out.println("4. Wire");
         System.out.println("::::option::::");
         System.out.print("choise option to buy:-");
         int choise = sc.nextInt();
         sc.nextLine();
         System.out.println("quntity to buy a product:-");
         int quntity = sc.nextInt();
         sc.nextLine();
         switch (choise) {
            case 1:
               a += quntity;
               sum += (1000 + (1000 * 0.08)) * quntity;
               System.out.println("price of motor is:-" + (1000 + (1000 * 0.08)) * quntity);
               System.out.println("your total bill is:-" + sum);
               break;
            case 2:
               b += quntity;
               sum += (500 + (500 * 0.12)) * quntity;
               System.out.println("price of fan is:-" + (500 + (500 * 0.12)) * quntity);
               System.out.println("your total bill is:-" + sum);
               break;
            case 3:
               c += quntity;
               sum += (200 + (200 * 0.075)) * quntity;
               System.out.println("price of tube is:-" + (200 + (200 * 0.075)) * quntity);
               System.out.println("your total bill is:-" + sum);
               break;
            case 4:
               d += quntity;
               sum += (50 + (50 * 0.03)) * quntity;
               System.out.println("price of wire is:-" + (50 + (50 * 0.03)) * quntity);
               System.out.println("your total bill is:-" + sum);
               break;
         }
         System.out.println("do you want to continue(y/n):-");
         h = sc.next().charAt(0);
      } while (h == 'y');
      System.out.println("your final bill:-");
      if (a > 0)
         System.out.println("Motor price for quntity" + a + ":-" + a * (1000 + (1000 * 0.08)));
      if (b > 0)
         System.out.println("Fan pricefor quntity" + b + ":-" + b * (500 + (500 * 0.12)));
      if (c > 0)
         System.out.println("Tube pricefor quntity" + c + ":-" + c * (200 + (200 * 0.075)));
      if (d > 0)
         System.out.println("wire pricefor quntity" + d + ":-" + d * (50 + (50 * 0.03)));
      System.out.println("total price:-" + sum);
      System.out.println("\n23DIT010_harsh donda");
   }

}
