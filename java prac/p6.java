import java.util.Scanner;

public class p6 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string: ");
      String s = sc.nextLine();
      System.out.println("enter a number:-");
      int n=sc.nextInt();
      int p=s.length();
      string(s,p,n);
      // sc.nextLine();
   }
   public static void string(String s,int p,int n) {
      String x;
      if(p>n){
       x=s.substring(0,p/2+1);
      }
      else
      {
        x=s.substring(0,p);
      }
      for(int i=0;i<n;i++)
      {
         // for(int j=0;j<=p/2+1;j++)
         System.out.println(x);
      }
      System.out.println("\n23DIT010_harsh donda");
   }
}
