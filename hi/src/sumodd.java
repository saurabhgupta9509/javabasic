import java.util.Scanner;

public class sumodd {
     int sum;
    

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
         for(int i= 1; i >=0; i++ ) {
            for (int j = 1; j <= 100; j++) {
            if (j % 2 != 0) {
              System.out.println(j);
              System.out.println(i);
            }
            int sum = i +j; 
        }
         }
         System.out.println(sum);
    }
}
