import java.util.*;

public class p17 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      employee emp;
      emp = new employee();
      System.out.println("enter employee detail:-");
      emp.getdata();
      emp.getd();
      maneger men;
      men = new maneger();
      System.out.println("enter employee detail:-");
      men.getdata();
      men.getm();
      int ch;
      do{
      System.out.println("1.employee detail");
      System.out.println("2.maneger detail");
      System.out.println("3.exit");
      ch = sc.nextInt();
   
      switch (ch) {
         case 1:
         emp.putdata();
         emp.putd();
         break;
         case 2:
         men.putdata();
         men.putm();
         break;
         case 3:
         System.exit(0);
         break;
      }
   }while(ch<3);
   }
}

class member {
   Scanner sc = new Scanner(System.in);
   String name;
   int age;
   String address;
   String phone;
   int salary;

   void getdata() {
      System.out.println("Enter a member name:-");
      name = sc.nextLine();
      System.out.println("Enetr a age of the member:-");
      age = sc.nextInt();
      sc.nextLine();
      System.out.println("Enter a address of the member:-");
      address = sc.nextLine();
      System.out.println("Enter a phone number of the member:-");
      phone = sc.nextLine();
      System.out.println("Enter a salary of the member:-");
      salary = sc.nextInt();
   }

   void putdata() {
      System.out.println("name of mamber:-" + name);
      System.out.println("age of mamber:-" + age);
      System.out.println("address of mamber:-" + address);
      System.out.println("phone number of mamber:-" + phone);
      System.out.println("salary of mamber:-" + salary);
   }
}

class employee extends member {
   Scanner sc = new Scanner(System.in);
   int emp_id;
   int dept_id;

   void getd() {
      System.out.println("Enter a employee id:-");
      emp_id = sc.nextInt();
      System.out.println("Enter a department id:-");
      dept_id = sc.nextInt();
   }

   void putd() {
      System.out.println("employee id:-" + emp_id);
      System.out.println("department id:-" + dept_id);
   }
}

class maneger extends member {
   Scanner sc = new Scanner(System.in);
   int man_id;
   int dept_id;

   void getm() {
      System.out.println("Enter a manager id:-");
      man_id = sc.nextInt();
      System.out.println("Enter a department id:-");
      dept_id = sc.nextInt();
   }

   void putm() {
      System.out.println("manager id:-" + man_id);
      System.out.println("department id:-" + dept_id);
   }
}
