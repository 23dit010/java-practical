import java.util.*;

public class p14 {
   int date = 0, month = 0, year = 0;

   public static void main(String[] args) {
      date o1 = new date();
      o1.setdate();
      o1.setmonth();
      o1.setyear();
      o1.getdate();
      o1.getmonth();
      o1.getyear();
      o1.display();
      System.out.println("\n23DIT010_harsh donda");
   }
}

class date {
   Scanner sc = new Scanner(System.in);
   int date = 0, month = 0, year = 0;

   public date() {
      date = 0;
      month = 0;
      year = 0;
   }

   void setdate() {
      System.out.println("Enter the date:-");
      date = sc.nextInt();
   }

   void setmonth() {
      System.out.println("Enter the month:-");
      month = sc.nextInt();
   }

   void setyear() {
      System.out.println("Enter the year:-");
      year = sc.nextInt();
   }

   void getdate() {
      System.out.println("date:-" + date);
   }

   void getmonth() {
      System.out.println("month:-" + month);
   }

   void getyear() {
      System.out.println("year:-" + year);
   }

   void display() {
      System.out.println("your date is:- " + date + "/" + month + "/" + year);
   }
}
