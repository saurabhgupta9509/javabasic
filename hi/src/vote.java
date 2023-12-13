import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age : ");
        int age = sc.nextInt();
        if(age < 18){
            System.out.println("you are not eligible for the vote");
        }
        else if(age == 18){
            System.out.println("you have to wait until your age is greater than 18");
        }
        else{
            System.out.println("you are eligible for the vote");
        }
    }
}
