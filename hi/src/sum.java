import java.util.*;

public class sum {
    public static int add(int num1,  int num2){
        
        int sum1 = num1 + num2 ;
        return sum1;
    }
       public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
      add(num1,num2);
        System.out.println(num1 +num2 ); 
    }

    
}
