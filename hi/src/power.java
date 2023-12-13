import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                System.out.println(" enetr the first x number : ");
                int x = sc.nextInt();
                System.out.println("enetr the no. n : ");
                int n = sc.nextInt();
                for (int i = 0; i < n ; i++) {
                    x *= n;
                    System.out.println("the base " + x +"the pwer " + n);
                }
    }
}
