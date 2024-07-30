
public class p10 {
   public static void main(String[] args) {
       String s="CHARUSAT UNIVERSITY";
       String str="Donda";
       char a[]=s.toCharArray();
       for(int i=0;i<s.length();i++)
       {
         if(a[i]=='H')
         {
            a[i]=str.charAt(0);
         }
       }
       String s1=new String(a);
       System.out.println(s1);
       System.out.println("\n23DIT010_harsh donda");
   }
}
