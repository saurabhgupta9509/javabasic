import java.util.Scanner;

class A{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a==0) 
        {
              System.out.println("this is zero");
         } else if (a>0) 
         {
            System.out.println("this is positive numbers");
         } else if (a<0)
          {
            System.out.println("this is negative  numbers ");
          } else 
          {
            System.out.println("this is invalid ");
         }

    }
}
