public class p16new  {
   public static void main(String[] args) {
       perants p;
       p=new perants();
       p.display();
       child c;
       c=new child();
       c.display();
   }
}
class perants{
   void display()
   {
      System.out.println("this is perents class");
   }
}
class child extends perants{
   void display()
   {
      System.out.println("this is child class");
   }
}