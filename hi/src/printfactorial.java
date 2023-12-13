import java.util.*;
public class printfactorial {
    public static void factorial1(int n){
        int factorial=1;
        if(n <0){
            System.out.println("this invalid number ");
            return;
        }
        for(int i = n; i>=1 ; i--){
            factorial = factorial *i;
            
            
        }
    System.out.println(factorial);
    return;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factorial1(n);
       
    }
    
}
