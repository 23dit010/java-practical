import java.util.*;
public class p18b {
   public static void main(String[] args) {
       truck t;
       t = new truck();
       System.out.println("enter a truck detail:-");
       t.getd();
       bike b;
       b = new bike();
       System.out.println("enter a bike detail:-");
       b.get();
       car c; 
      c = new car();
      System.out.println("enter a car detail:-");
      c.set();
      int ch;
      do{
      System.out.println("1.truck");
      System.out.println("2.bike");
      System.out.println("3.car");
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your choice:=");
       ch = sc.nextInt();
      switch(ch){
         case 1:
         t.putdata();
         break;
         case 2:
         b.put();
         break;
         case 3:
         c.dis();
         break;
      }
   }while(ch<4);
   }
}
class vehicle{
   Scanner sc= new Scanner(System.in);
   String color;
   String plat_no;
   void getdata()
   {
      System.out.println("Enter a vehicle color:- ");
      color=sc.nextLine();
      System.out.println("Enter a vehicle plate number:- ");
      plat_no=sc.nextLine();
   }
   void display()
   {
      System.out.println("Vehicle color:- "+color);
      System.out.println("Vehicle plate number:- "+plat_no);
   }
}
class truck extends vehicle{
   String modal;
   String fule_type;
   int buy_year;
   String make;
   int max_speed;
   int distance;
   void getd()
   {
      super.getdata();
      System.out.println("Enter a truck modal:- ");
      modal=sc.nextLine();
      System.out.println("Enter a truck fule type:- ");
      fule_type=sc.nextLine();
      System.out.println("Enter a truck buy year:- ");
      buy_year=sc.nextInt();
      sc.nextLine();
      System.out.println("Enter a truck make:- ");
      make=sc.nextLine();
      System.out.println("Enter a truck max speed:- ");
      max_speed=sc.nextInt();
      System.out.println("Enter a truck distance:- ");
      distance=sc.nextInt();
   }
   void putdata()
   {
      super.display();
      System.out.println("truck modal:- "+modal);
      System.out.println("truck fule type:- "+fule_type);
      System.out.println("truck buy year:- "+buy_year);
      System.out.println("truck make:- "+make);
      System.out.println("truck max speed:- "+max_speed);
      System.out.println("truck distance:- "+distance);
   }
}
class bike extends vehicle{
   String modal;
   String fule_type;
   int buy_year;
   String make;
   int max_speed;
   int distance;
   void get()
   {
      super.getdata();
      System.out.println("Enter a bike modal:- ");
      modal=sc.nextLine();
      System.out.println("Enter a bike fule type:- ");
      fule_type=sc.nextLine();
      System.out.println("Enter a bike buy year:- ");
      buy_year=sc.nextInt();
      sc.nextLine();
      System.out.println("Enter a bike make:- ");
      make=sc.nextLine();
      System.out.println("Enter a bike max speed:- ");
      max_speed=sc.nextInt();
      System.out.println("Enter a bike distance:- ");
      distance=sc.nextInt();
   }
   void put()
   {
      super.display();
      System.out.println("bike modal:- "+modal);
      System.out.println("bike fule type:- "+fule_type);
      System.out.println("bike buy year:- "+buy_year);
      System.out.println("bike make:- "+make);
      System.out.println("bike max speed:- "+max_speed);
      System.out.println("bike distance:- "+distance);
   }
}
class car extends vehicle{
   String modal;
   String fule_type;
   int buy_year;
   String make;
   int max_speed;
   int distance;
   void set()
   {
      super.getdata();
      System.out.println("Enter a car modal:- ");
      modal=sc.nextLine();
      System.out.println("Enter a car fule type:- ");
      fule_type=sc.nextLine();
      System.out.println("Enter a car buy year:- ");
      buy_year=sc.nextInt();
      sc.nextLine();
      System.out.println("Enter a car make:- ");
      make=sc.nextLine();
      System.out.println("Enter a car max speed:- ");
      max_speed=sc.nextInt();
      System.out.println("Enter a car distance:- ");
      distance=sc.nextInt();
   }
   void dis()
   {
      super.display();
      System.out.println("car modal:- "+modal);
      System.out.println("car fule type:- "+fule_type);
      System.out.println("car buy year:- "+buy_year);
      System.out.println("car make:- "+make);
      System.out.println("car max speed:- "+max_speed);
      System.out.println("car distance:- "+distance);
   }
}
