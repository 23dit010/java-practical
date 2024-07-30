import java.util.Arrays;
public class p9 {
   public static void main(String[] args) {
       String s="Harsh donda";
       System.out.println(s.length());
    //    System.out.println(s.toLowerCase());
       int  x;
       for(int i=0;i<s.length();i++)
       {
           x = s.charAt(i)+32;
        if(x>=97 && x<=122)
        System.out.print((char)x);
        else
        System.out.print(s.charAt(i));
       }
       System.out.println(" ");
       for(int i=0;i<s.length();i++)
       {
           x = s.charAt(i)-32;
        if(x>=65 && x<=90)
        System.out.print((char)x);
        else
        System.out.print(s.charAt(i));
       }
       System.out.println(" ");
    //    System.out.println(s.toUpperCase());
       String str="";
       for(int i=s.length()-1;i>=0;i--)
       {
        str+=s.charAt(i);
       }
       System.out.println(str);
       char a[]=new char[s.length()];
       for(int i=0;i<s.length();i++)
       {
            a[i]=s.charAt(i);
       }
       Arrays.sort(a);
       String st=new String(a);
       System.out.println(st);
       System.out.println("\n23DIT010_harsh donda");
   }
}
