import java.util.Scanner;

public class average {
    public static void printaverage(int n1,int n2,int n3){
        int avearage1= (n1 + n2 + n3)/2;
       System.out.println("this is the average of the thrre numbers " + avearage1);
       return;
    } 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        printaverage(n1, n2, n3);

        
    }
    
}
